package ExceptionHandlingTaskFour;

import java.util.function.Consumer;

@FunctionalInterface
interface ConsumerWithException<T> {
    void accept(T t) throws Exception;
}

public class ExceptionHandler {
    public static Consumer<String> handlingConsumer(ConsumerWithException<String> consumerWithException) {
        return s -> {
            try {
                consumerWithException.accept(s);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        };
    }

    public static void main(String[] args) {
        Consumer<String> stringProcessor = handlingConsumer(s -> {
            if (s.isEmpty()) {
                throw new IllegalArgumentException("Empty String");
            }
            System.out.println("Processing: " + s);
        });
        stringProcessor.accept("Hello");
        stringProcessor.accept("");
    }
}
