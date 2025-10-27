package racingcar;

import java.util.List;

public class RaceView {

    public void showStartMessage() {
        System.out.println("\n실행 결과");
    }

    //현재 라운드 자동차 이동 결과 출력
    public void showRound(CarGroup group) {
        for (Car car : group.all()) {
            System.out.println(car.getName() + " : " + car.progress());
        }
        System.out.println();
    }

    public void showWinners(List<String> winners) {
        System.out.println("최종 우승자: " + String.join(", ", winners));
    }
}
