package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class RaceTest {
    private static final String VALID_PARTICIPANT_MESSAGE = "참가 자동차 수는 1 이상이어야 합니다.";

    @DisplayName("참가 자동차 수가 0 이하이면 예외를 던진다.")
    @Test
    void convert_object_to_xml_string_non_static_error() {
        // given
        int givenParticipantNumber = 0;
        int givenGameNumber = 1;
        // then
        assertThatThrownBy(() ->
                Race.of(givenParticipantNumber, givenGameNumber))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(VALID_PARTICIPANT_MESSAGE);
    }
}
