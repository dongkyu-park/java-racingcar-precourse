package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car("test1");
    }

    @Test
    void setPosition_carStatus_is_GO() {
        assertThat(car.setPosition(CarStatus.GO)).hasFieldOrPropertyWithValue("position", 1);
    }

    @Test
    void setPosition_carStatus_is_STOP() {
        assertThat(car.setPosition(CarStatus.STOP)).hasFieldOrPropertyWithValue("position", 0);
    }

}
