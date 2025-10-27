package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;

public class UserInput {

    public List<String> readCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,)로 구분)");
        String input = Console.readLine().trim();
        List<String> names = Arrays.asList(input.split(","));
        if (names.isEmpty()) {
            throw new IllegalArgumentException("자동차 이름을 입력해야 합니다.");
        }
        for (String name : names) {
            if (name.length() > 5 || name.isBlank()) {
                throw new IllegalArgumentException("자동차 이름은 1~5자 이내여야 합니다.");
            }
        }
        return names;
    }
}
