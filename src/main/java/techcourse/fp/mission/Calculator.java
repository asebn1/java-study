package techcourse.fp.mission;

import java.util.List;
import java.util.function.IntPredicate;

public class Calculator {

    public static int sum(List<Integer> numbers, IntPredicate condition) {
        int total = 0;
        for (int number : numbers) {
            if (condition.test(number)){
                total += number;
            }
        }
        return total;
    }
}
