package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.*;

public class CarTest {

    @Test
    void validate_car_name_1_5() {
        assertThatThrownBy(()->new Car("t, test2,, test")).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(()->new Car("test1, 6글자테스트, test5, test")).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void validate_car_min_count_2() {
        assertThatThrownBy(()->new Car("")).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(()->new Car("test")).isInstanceOf(IllegalArgumentException.class);
    }
}
