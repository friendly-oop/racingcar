package racingcar.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static racingcar.util.RandomNumberGenerator.pullNumber;

class RandomNumberGeneratorTest {
    private List<Integer> expectedNumbers = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

    @DisplayName("0 ~ 9 사이에 난수를 생성한다.")
    @Test
    void print_car_distance_by_hyphen() {
        // when
        int randomNumber = pullNumber();

        // then
        assertThat(randomNumber).isIn(expectedNumbers);
    }

}
