package racingcar;

public class Car {

    public static final int MIN_LENGTH = 1;
    public static final int MAX_LENGTH = 5;
    public static final int MIN_CAR_ARRAY = 2;
    private int carNameMinLength = MIN_LENGTH;
    private int carNameMaxLength = MAX_LENGTH;
    private String[] carArray;

    public Car(String car) {
        String[] tempCarArray = car.split(",");
        if (!validCarNameCount(tempCarArray)) {
            throw new IllegalArgumentException("레이싱 카의 이름은 1자 이상, 5자 이하로 입력해야 합니다.");
        }
        if (!validCarArrayCount(tempCarArray)) {
            throw new IllegalArgumentException("2개 이상의 레이싱 카를 입력해야 합니다.");
        }
        this.carArray = tempCarArray;
    }

    private boolean validCarArrayCount(String[] tempCarArray) {
        return tempCarArray.length >= MIN_CAR_ARRAY;
    }

    public boolean validCarNameCount(String[] tempCarArray) {
        for (String car : tempCarArray) {
            carNameMinLength = Math.min(carNameMinLength, car.trim().length());
            carNameMaxLength = Math.max(carNameMaxLength, car.trim().length());
        }
        return carNameMinLength >= MIN_LENGTH && carNameMaxLength <= MAX_LENGTH;
    }

}
