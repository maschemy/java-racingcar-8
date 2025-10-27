package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;

public class UserInput {

    //결주할 자동차 이름을 쉼표(,) 기준을 입력받는다.
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

    //이동 횟수를 입력받는다.
    public int readRoundCount() {
        System.out.println("시도할 횟수를 입력하세요.");
        String input = Console.readLine().trim();
        try {
            int count = Integer.parseInt(input);
            if (count <= 0) {
                throw new IllegalArgumentException("시도 횟수는 1 이상이어야 합니다.");
            }
            return count;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자를 입력해야 합니다.");
        }
    }
}
