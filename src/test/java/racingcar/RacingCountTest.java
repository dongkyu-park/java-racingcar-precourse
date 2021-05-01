package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class RacingCountTest {

    @Test
    void valid_racing_count_not_under_1() {
        assertThatThrownBy(()->new RacingCount(0)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(()->new RacingCount(-1)).isInstanceOf(IllegalArgumentException.class);
    }
}
