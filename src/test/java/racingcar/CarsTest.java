package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class CarsTest {

    @Test
    void validate_car_name_1_5() {
        assertThatThrownBy(()->new Cars("t, test2,, test")).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(()->new Cars("test1, 6글자테스트, test5, test")).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void validate_car_min_count_2() {
        assertThatThrownBy(()->new Cars("")).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(()->new Cars("test")).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void validate_car_name_duplicate() {
        assertThatThrownBy(()->new Cars("test, test")).isInstanceOf(IllegalArgumentException.class);
    }

}
