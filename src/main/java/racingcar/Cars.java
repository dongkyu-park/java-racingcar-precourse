package racingcar;

import java.util.*;

public class Cars {

    public static final int MIN_LENGTH = 1;
    public static final int MAX_LENGTH = 5;
    public static final int MIN_CAR_ARRAY = 2;

    private int carNameMinLength = MIN_LENGTH;
    private int carNameMaxLength = MAX_LENGTH;
    private List<Car> carList;

    public Cars(String car) {
        String[] tempCarArray = car.replaceAll(" ", "").split(",");
        if (!validCarNameCount(tempCarArray)) {
            throw new IllegalArgumentException("레이싱 카의 이름은 1자 이상, 5자 이하로 입력해야 합니다.");
        }
        if (!validCarArrayCount(tempCarArray)) {
            throw new IllegalArgumentException("2개 이상의 레이싱 카를 입력해야 합니다.");
        }
        if (!validCarNameDuplicate(tempCarArray)) {
            throw new IllegalArgumentException("중복 된 레이싱 카 이름이 존재합니다.");
        }
        this.carList = mapCar(tempCarArray);
    }

    public List<Car> getCarList() {
        return carList;
    }

    private List<Car> mapCar(String[] tempCarArray) {
        List<Car> carList = new ArrayList<>();
        for (String car : tempCarArray) {
            carList.add(new Car(car));
        }
        return carList;
    }

    private boolean validCarNameDuplicate(String[] tempCarArray) {
        Set<String> nonDuplicateCarName = new HashSet<>(Arrays.asList(tempCarArray));
        return nonDuplicateCarName.size() == tempCarArray.length;
    }

    private boolean validCarArrayCount(String[] tempCarArray) {
        return tempCarArray.length >= MIN_CAR_ARRAY;
    }

    public boolean validCarNameCount(String[] tempCarArray) {
        for (String car : tempCarArray) {
            carNameMinLength = Math.min(carNameMinLength, car.length());
            carNameMaxLength = Math.max(carNameMaxLength, car.length());
        }
        return carNameMinLength >= MIN_LENGTH && carNameMaxLength <= MAX_LENGTH;
    }

}
