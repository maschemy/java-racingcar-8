package racingcar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
    //가장 멀리 간 자동차를 찾아서 우승자 리스트 반환
    public List<String> getWinners() {
        int max = cars.stream().mapToInt(Car::getDistance).max().orElse(0);
        return cars.stream()
                .filter(c -> c.getDistance() == max)
                .map(Car::getName)
                .collect(Collectors.toList());
    }
}
