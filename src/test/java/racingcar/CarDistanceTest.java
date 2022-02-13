package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarDistanceTest {

    @DisplayName("자동차의 이동 거리를 하이픈(-)으로 출력한다.")
    @Test
    void print_car_distance_by_hyphen() {
        // given
        int distance = 2;
        CarDistance carDistance = new CarDistance(distance);

        // when
        String result = carDistance.printDistance();

        // then
        assertThat(result).isEqualTo("--");
    }

    @DisplayName("자동차는 random값이 4 이상이면 한 칸 움직인다.")
    @ParameterizedTest
    @ValueSource(ints = {4, 5, 6, 7, 8, 9})
    void one_move_more_than_four(int randomValue) {
        // given
        int distance = 2;
        CarDistance carDistance = new CarDistance(distance);

        // when
        carDistance.move(randomValue);
        String result = carDistance.printDistance();

        // then
        assertThat(result).isEqualTo("---");
    }

    @DisplayName("자동차는 random값이 3 이하이면 이동하지 않는다.")
    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3})
    void not_move_not_more_than_four(int randomValue) {
        // given
        int distance = 2;
        CarDistance carDistance = new CarDistance(distance);

        // when
        carDistance.move(randomValue);
        String result = carDistance.printDistance();

        // then
        assertThat(result).isEqualTo("--");
    }

    @DisplayName("자동차의 random값이 음수 또는 9 초과이면 예외를 던진다.")
    @ParameterizedTest
    @ValueSource(ints = {-1, 10})
    void exception_outlier_input(int randomValue) {
        // given
        int distance = 2;
        CarDistance carDistance = new CarDistance(distance);

        // when

        // then
        assertThatThrownBy( () -> carDistance.move(randomValue))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("파라미터가 음수 혹은 9 초과이면 안됩니다.");
    }
}
