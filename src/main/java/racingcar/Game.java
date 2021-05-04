package racingcar;

import javax.xml.bind.annotation.XmlType;
import java.util.List;

public class Game {

    public static final int DO_GO = 4;
    public static final int DEFAULT_POSITION = 0;

    public int generatePower() {
        return (int)(Math.random()*10);
    }

    public CarStatus setCarStatus(int power) {
        if (power >= DO_GO) {
            return CarStatus.GO;
        }
        return CarStatus.STOP;
    }

    public List<Car> play(Cars cars) {
        List<Car> carList = cars.getCarList();
        for (int i = 0; i < carList.size(); i++) {
            carList.set(i, carList.get(i).setPosition(setCarStatus(generatePower())));
        }
        return carList;
    }

    public String winner(List<Car> result) {
        return getWinnerName(result, getMaxPosition(result));
    }

    private int getMaxPosition(List<Car> result) {
        int position = DEFAULT_POSITION;
        for (int i = 0; i < result.size(); i++) {
            position = Math.max(position, result.get(i).getPosition());
        }
        return position;
    }

    private String getWinnerName(List<Car> result, int maxPosition) {
        String winner = "";
        for (int i = 0; i < result.size(); i++) {
            winner += comparePosition(result.get(i), maxPosition);
        }
        return winner.trim().replaceAll(" ", ",");
    }

    private String comparePosition(Car car, int maxPosition) {
        if (car.getPosition() == maxPosition) {
            return " " + car.getCarName();
        }
        return "";
    }

}
