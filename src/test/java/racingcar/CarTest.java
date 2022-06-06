package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    @DisplayName("움직이면 위치가 1 증가한다.")
    @Test
    void move_test() {
        // given
        Car car = new Car();
        int nowLocation = car.getLocation();

        // when
        car.move();
        int locationAfterMove = car.getLocation();

        // then
        assertThat(locationAfterMove).isEqualTo(nowLocation + 1);
    }

}
