package baseball.domain;

import java.util.List;

public class Referee {
    public String compare(List<Integer> computer, List<Integer> player) {
        Judgment judgment = new Judgment();
        int collectCount = judgment.correctCount(computer, player);

        int strike = 0;
        for (int i = 0; i < player.size(); i++) {
            if (judgment.hasPlace(computer, i, player.get(i))) {
                strike++;
            }
        }

        int ball = collectCount - strike;

        if (strike > 0 && ball == 0) {
            return strike + "스트라이크";
        } else if (strike == 0 && ball > 0) {
            return ball + "볼";
        } else if (strike == 0 && ball == 0) {
            return "낫싱";
        } else {
            return ball + "볼 " + strike + "스트라이크";
        }
    }
}
