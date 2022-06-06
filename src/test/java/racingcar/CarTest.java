package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {
    private static final int CAR_MOVE_DISTANCE = 1;

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
        assertThat(locationAfterMove).isEqualTo(nowLocation + CAR_MOVE_DISTANCE);
    }

}
