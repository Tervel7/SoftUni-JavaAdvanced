package FunctionalProgramming;

import java.util.Scanner;
import java.util.function.BiFunction;

public class SumNumbersBiFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(", ");

        BiFunction<Integer, String, Integer> addNumberTo = (i, s) -> Integer.parseInt(s) + i;

        int sum = 0;
        for (int i=0; i<numbers.length; i++) {
            sum = addNumberTo.apply(sum, numbers[i]);
        }

        System.out.println("Count: " + numbers.length);
        System.out.println("Sum: " + sum);
    }
}
