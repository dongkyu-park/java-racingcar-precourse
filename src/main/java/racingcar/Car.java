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

}
