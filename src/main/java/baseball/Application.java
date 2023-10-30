package baseball;

import baseball.domain.Judgment;
import baseball.domain.NumberGenerator;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
//        NumberGenerator numberGenerator = new NumberGenerator();
//        List<Integer> numbers = numberGenerator.createRandomNumbers();
//        System.out.println("numbers = " + numbers);

        Judgment judgment = new Judgment();
        int count = judgment.collectCount(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3));
        System.out.println("count = " + count);
    }
}
