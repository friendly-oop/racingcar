package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class RaceTest {
    private static final String VALID_PARTICIPANT_COUNT_MESSAGE = "참가 자동차 수는 1 이상이어야 합니다.";
    private static final String VALID_GAME_COUNT_MESSAGE = "경기 수는 1 이상이어야 합니다.";

    @DisplayName("참가 자동차 수가 0 이하이면 예외를 던진다.")
    @Test
    void participant_count_zero_exception_test() {
        // given
        int givenParticipantNumber = 0;
        int givenGameNumber = 1;

        // then
        assertThatThrownBy(() ->
                Race.of(givenParticipantNumber, givenGameNumber))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(VALID_PARTICIPANT_COUNT_MESSAGE);
    }

    @DisplayName("경기 수가 0 이하이면 예외를 던진다.")
    @Test
    void game_count_zero_exception_test() {
        // given
        int givenParticipantNumber = 1;
        int givenGameNumber = 0;

        // then
        assertThatThrownBy(() ->
                Race.of(givenParticipantNumber, givenGameNumber))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(VALID_GAME_COUNT_MESSAGE);
    }

    @DisplayName("참가 자동차 수를 크기로 가지는 participant List를 가진다.")
    @Test
    void participants_size_test() {
        // given
        int givenParticipantNumber = 3;
        int givenGameNumber = 5;

        // when
        Race race = Race.of(givenParticipantNumber, givenGameNumber);
        int result = race.getParticipantSize();

        // then
        assertThat(result).isEqualTo(givenParticipantNumber);
    }
}
