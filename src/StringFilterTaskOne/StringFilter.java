package StringFilterTaskOne;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StringFilter {
    public static List<String> filterStrings(List<String> strings, Predicate<String> condition) {
        List<String> filteredStrings = new ArrayList<>();

        strings.forEach(string -> {
            if (condition.test(string)) {
                filteredStrings.add(string);
            }
        });
        return filteredStrings;
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Hello");
        strings.add("Weather");
        strings.add("Strings");

        Predicate<String> lengthMoreThanFive = s -> s.length() > 5;
        List<String> filteredStrings = filterStrings(strings, lengthMoreThanFive);
        System.out.println("Filtered strings: " + filteredStrings);
    }
}