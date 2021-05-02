package racingcar;

public class Car {

    private String carName;
    private int position = 0;

    public Car(String car) {
        this.carName = car;
    }

    public Car setPosition(CarStatus carStatus) {
        if (carStatus.isGo()) {
            this.position++;
        }
        return this;
    }

    @Override
    public String toString() {
        String dashBar = "";
        for (int i = 0; i < position; i++) {
            dashBar = dashBar + "-";
        }
        return carName + " : " + dashBar;
    }

    public int getPosition() {
        return position;
    }

    public String getCarName() {
        return carName;
    }

}
