#include "mediapipe/framework/port/statusor.h"

namespace mediapipe {

absl::StatusOr<std::string> GetDefaultTraceLogDirectory() {
  return "/data/local/tmp";
}

}  // namespace mediapipe
