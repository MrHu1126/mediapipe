// Copyright 2020 The MediaPipe Authors.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

#include <vector>

#include "mediapipe/calculators/pytorch/pytorch_converter_calculator.pb.h"
#include "mediapipe/framework/calculator_framework.h"
#include "mediapipe/framework/formats/image_frame.h"
#include "mediapipe/framework/formats/image_frame_opencv.h"
#include "mediapipe/framework/port/gtest.h"
#include "mediapipe/framework/port/parse_text_proto.h"
#include "mediapipe/framework/port/status_matchers.h"  // NOLINT
#include "torch/torch.h"

namespace mediapipe {

using Outputs = std::vector<torch::jit::IValue>;

class PyTorchConverterCalculatorTest : public ::testing::Test {
  std::unique_ptr<CalculatorGraph> graph_;
};

TEST_F(PyTorchConverterCalculatorTest, CustomDivAndSub) {
  CalculatorGraph graph;
  // Run the calculator and verify that one output is generated.
  CalculatorGraphConfig graph_config =
      ::mediapipe::ParseTextProtoOrDie<CalculatorGraphConfig>(R"(
        input_stream: "input_image"
        node {
          calculator: "PyTorchConverterCalculator"
          input_stream: "IMAGE:input_image"
          output_stream: "TENSORS:tensor"
          options {
            [mediapipe.PyTorchConverterCalculatorOptions.ext] {
              per_channel_normalizations: { sub: 0.485 div: 0.229 }
              per_channel_normalizations: { sub: 0.456 div: 0.224 }
              per_channel_normalizations: { sub: 0.406 div: 0.225 }
            }
          }
        }
      )");
  std::vector<Packet> output_packets;
  tool::AddVectorSink("tensor", &graph_config, &output_packets);

  // Run the graph.
  MP_ASSERT_OK(graph.Initialize(graph_config));
  MP_ASSERT_OK(graph.StartRun({}));
  auto input_image = absl::make_unique<ImageFrame>(ImageFormat::SRGB, 1, 1);
  cv::Mat mat = ::mediapipe::formats::MatView(input_image.get());
  mat = cv::Scalar(200, 201, 202);
  MP_ASSERT_OK(graph.AddPacketToInputStream(
      "input_image", Adopt(input_image.release()).At(Timestamp(0))));

  // Wait until the calculator done processing.
  MP_ASSERT_OK(graph.WaitUntilIdle());

  // Get and process results.
  const Outputs& tensor_vec = output_packets[0].Get<Outputs>();
  EXPECT_EQ(1, tensor_vec.size());
  const torch::Tensor& tensor = tensor_vec[0].toTensor();
  EXPECT_EQ(4, tensor.dim());
  const float* tensor_data = tensor.data<float>();
  EXPECT_FLOAT_EQ(1.3412966f, tensor_data[0]);
  EXPECT_FLOAT_EQ(1.4831932f, tensor_data[1]);
  EXPECT_FLOAT_EQ(1.6813947f, tensor_data[2]);

  // Fully close graph at end, otherwise calculator+tensors are destroyed
  // after calling WaitUntilDone().
  MP_ASSERT_OK(graph.CloseInputStream("input_image"));
  MP_ASSERT_OK(graph.WaitUntilDone());
}

}  // namespace mediapipe
