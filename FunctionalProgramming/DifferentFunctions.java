package FunctionalProgramming;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DifferentFunctions {
    public static void main(String[] args) {

        Function<String, Integer> parser = Integer::parseInt;
        int num = parser.apply("4");

        Consumer<String> printer = System.out::println;
        printer.accept("Hello World!");

        Supplier<Integer> genRandomNumber = () -> new Random().nextInt(51);
        int randomNumber = genRandomNumber.get();

        Predicate<Integer> isEven = number -> number%2==0;
        System.out.println(isEven.test(6));

    }
}
