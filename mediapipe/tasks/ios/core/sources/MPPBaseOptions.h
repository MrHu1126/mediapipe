/* Copyright 2022 The TensorFlow Authors. All Rights Reserved.
 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at
 http://www.apache.org/licenses/LICENSE-2.0
 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 ==============================================================================*/
#import <Foundation/Foundation.h>
#import "mediapipe/tasks/ios/core/sources/MPPExternalFile.h"

NS_ASSUME_NONNULL_BEGIN

/**
 * MediaPipe Tasks delegate.
 */
typedef NS_ENUM(NSUInteger, MPPDelegate) {

  /** CPU. */
  MPPDelegateCPU,

  /** GPU. */
  MPPDelegateGPU
} NS_SWIFT_NAME(Delegate);

/**
 * Holds the base options that is used for creation of any type of task. It has fields with
 * important information acceleration configuration, tflite model source etc.
 */
NS_SWIFT_NAME(BaseOptions)
@interface MPPBaseOptions : NSObject <NSCopying>

/**
 * The external model file, as a single standalone TFLite file. It could be packed with TFLite Model
 * Metadata[1] and associated files if exist. Fail to provide the necessary metadata and associated
 * files might result in errors.
 */
@property(nonatomic, copy) MPPExternalFile *modelAssetFile;

/**
 * device delegate to run the MediaPipe pipeline. If the delegate is not set, the default
 * delegate CPU is used.
 */
@property(nonatomic) MPPDelegate delegate;

@end

NS_ASSUME_NONNULL_END
