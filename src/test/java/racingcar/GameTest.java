package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GameTest {

    @Test
    void setCarStatus_power_under_4() {
        assertThat(Game.setCarStatus(3)).isEqualTo(CarStatus.STOP);
        assertThat(Game.setCarStatus(1)).isEqualTo(CarStatus.STOP);
    }

    @Test
    void setCarStatus_power_over_3() {
        assertThat(Game.setCarStatus(4)).isEqualTo(CarStatus.GO);
        assertThat(Game.setCarStatus(9)).isEqualTo(CarStatus.GO);
    }

}
