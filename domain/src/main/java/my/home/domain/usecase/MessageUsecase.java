
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package my.home.domain.usecase;

/**
 * Created by legendmohe on 15/12/1.
 */
public interface MessageUsecase extends Usecase {

    public static final String TAG = "MessageUsecase";

    public enum Mode {
        START_RECORD, CANCEL_RECORD, STOP_RECORD, SEND_MSG
    }

    Mode getMode();

    MessageUsecase setMode(Mode mode);
}
