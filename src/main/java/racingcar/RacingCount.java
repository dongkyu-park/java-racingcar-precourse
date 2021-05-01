package racingcar;

public class RacingCount {

    public static final int MIN_RACING_COUNT = 1;
    private int racingCount;

    public RacingCount(int count) {
        if (count < MIN_RACING_COUNT) {
            throw new IllegalArgumentException("경주 횟수는 1이상의 숫자로 입력해야 합니다.");
        }
        this.racingCount = count;
    }
}
