package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RacingUI {

    private final static Scanner sc = new Scanner(System.in);
    private final static Game game = new Game();
    private static List<Car> result = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        Cars cars = new Cars(sc.nextLine());

        System.out.println("시도할 회수는 몇회인가요?");
        RacingCount racingCount = new RacingCount(sc.nextInt());
        System.out.println();

        System.out.println("실행 결과");
        for (int i = 0; i < racingCount.getRacingCount(); i++) {
            result = game.play(cars);
            printResult(result);
            System.out.println();
        }
        System.out.println(game.winner(result) + "가 최종 우승했습니다.");
    }

    private static void printResult(List<Car> carList) {
        for (int i = 0; i < carList.size(); i++) {
            System.out.println(carList.get(i).toString());
        }
    }

}
