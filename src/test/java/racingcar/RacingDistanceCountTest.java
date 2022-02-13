package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class RacingDistanceCountTest {

    @DisplayName("이동 횟수가 빈값(null 포함)이면 예외를 던진다는 테스트")
    @Test
    void racing_distance_count_exception() {
        // given
        Integer distanceCount = null;
        // when

        // then
        assertThatThrownBy(() ->
                new RacingDistanceCount(distanceCount))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("이동횟수가 null이면 안 됩니다.");
    }
}
