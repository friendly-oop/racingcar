package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
}
