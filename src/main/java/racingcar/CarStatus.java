package racingcar;

public enum CarStatus {

    GO, STOP;

    public boolean isGo() {
        return this == GO;
    }

}