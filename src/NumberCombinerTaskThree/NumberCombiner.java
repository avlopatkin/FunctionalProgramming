package NumberCombinerTaskThree;

import java.util.function.BiFunction;

public class NumberCombiner {
    public static Integer combiner(Integer a, Integer b, BiFunction<Integer, Integer, Integer> combiner) {
        return combiner.apply(a, b);
    }

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> addition = (num1, num2) -> num1 + num2;
        BiFunction<Integer, Integer, Integer> multiply = (num1, num2) -> num1 * num2;

        Integer sumResult = combiner(5, 10, addition);
        System.out.println("Addition result: " + sumResult);

        sumResult = combiner(5, 10, multiply);
        System.out.println("Multiplication result: " + sumResult);

    }
}
