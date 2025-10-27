package racingcar;

import java.util.ArrayList;
import java.util.List;

/*
-모든 자동차 관리 및 이동처리
-우승자 계산
 */

public class CarGroup {
    private final List<Car> cars = new ArrayList<>();

    public CarGroup(List<String> names) {
        for (String name : names) {
            cars.add(new Car(name));
        }
    }

    public void moveCars() {
        for (Car car : cars) {
            car.move();
        }
    }

    public List<Car> all() {
        return cars;
    }
}
