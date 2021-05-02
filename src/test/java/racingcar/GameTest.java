package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GameTest {

    private Game game;

    @BeforeEach
    void setUp() {
        game = new Game();
    }

    @Test
    void setCarStatus_power_under_4() {
        assertThat(game.setCarStatus(3)).isEqualTo(CarStatus.STOP);
        assertThat(game.setCarStatus(1)).isEqualTo(CarStatus.STOP);
    }

    @Test
    void setCarStatus_power_over_3() {
        assertThat(game.setCarStatus(4)).isEqualTo(CarStatus.GO);
        assertThat(game.setCarStatus(9)).isEqualTo(CarStatus.GO);
    }

}
