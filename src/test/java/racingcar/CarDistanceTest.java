package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

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
}
