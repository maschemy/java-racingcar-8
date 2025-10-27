package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final String name;
    private int distance = 0;

    public Car(String name) {
        this.name = name;
    }

    //0 ~ 9 사이 랜덤값을 생성하여 4 이상이면 전진
    public void move() {
        int number = Randoms.pickNumberInRange(0, 9);
        if (number >= 4) {
            distance++;
        }
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    //현재 이동상태 표시
    public String progress() {
        return "-".repeat(distance);
    }
}
