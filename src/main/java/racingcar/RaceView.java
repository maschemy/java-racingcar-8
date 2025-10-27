package racingcar;

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
}
