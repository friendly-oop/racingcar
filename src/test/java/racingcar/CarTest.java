package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    @DisplayName("자동차의 이동거리를 가진다 (초기값은 0)")
    @Test
    void car_has_distance() {
        // given
        Car car = new Car();

        // when
        String result = car.printCarDistance();

        // then
        assertThat(result).isEqualTo("");
    }

}
