package baseball;

import baseball.domain.NumberGenerator;
import baseball.domain.Referee;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.println("숫자 야구 게임을 시작합니다.");
        boolean play = true;
        while (play) {
            NumberGenerator numberGenerator = new NumberGenerator();
            List<Integer> computer = numberGenerator.createRandomNumbers();

            Referee referee = new Referee();

            String result = "";
            while (!result.equals("3스트라이크")) {
                List<Integer> player = askNumbers();
                result = referee.compare(computer, player);
                System.out.println(result);
            }
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            play = restart();
        }



    }

    public static List<Integer> askNumbers() {
        System.out.print("숫자를 입력해 주세요 : ");
        String input = Console.readLine();
        if (Integer.parseInt(input) < 123 || Integer.parseInt(input) > 987) {
            throw new IllegalArgumentException();
        }
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            numbers.add(Integer.parseInt(String.valueOf(input.charAt(i))));
        }
        return numbers;
    }

    public static boolean restart() {
        String number = Console.readLine();
        if (Integer.parseInt(String.valueOf(number)) == 1) {
            return true;
        } else {
            return false;
        }
    }
}