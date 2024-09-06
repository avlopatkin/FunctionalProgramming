package NumberTransformerTaskTwo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class NumberTransformer {
    public static List<Integer> transformNumbers(List<Integer> numbers, Function<Integer, Integer> transformer) {
        List<Integer> transformedNumbers = new ArrayList<>();

        numbers.forEach(number -> transformedNumbers.add(transformer.apply(number)));
        return transformedNumbers;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Function<Integer, Integer> multiplyByTwo = num -> num * 2;

        List<Integer> transformedNumbers = transformNumbers(numbers, multiplyByTwo);

        System.out.println("Transformed numbers: " + transformedNumbers);
    }
}
