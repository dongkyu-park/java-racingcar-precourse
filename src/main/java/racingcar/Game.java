package racingcar;

import java.util.List;

public class Game {

    public static int generatePower() {
        return (int)(Math.random()*10);
    }

    public static CarStatus setCarStatus(int power) {
        if (power >= 4) {
            return CarStatus.GO;
        }
        return CarStatus.STOP;
    }

    public static List<Car> play(Cars cars) {
        List<Car> carList = cars.getCarList();
        for (int i = 0; i < carList.size(); i++) {
            carList.set(i, carList.get(i).setPosition(setCarStatus(generatePower())));
        }
        return carList;
    }

}
