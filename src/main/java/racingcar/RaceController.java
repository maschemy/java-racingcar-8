// RaceController.java
package racingcar;

import java.util.List;

public class RaceController {
    private final UserInput userInput = new UserInput();
    private final RaceView raceView = new RaceView();

    public void run() {
        List<String> carNames = userInput.readCarNames();
        int roundCount = userInput.readRoundCount();
        CarGroup carGroup = new CarGroup(carNames);

        raceView.showStartMessage();

        for (int i = 0; i < roundCount; i++) {
            carGroup.moveCars();
            raceView.showRound(carGroup);
        }

        raceView.showWinners(carGroup.getWinners());
    }
}
