package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumNumbers {
    public static void main(String[] args) {
        Function<String, Integer> parser = Integer::parseInt;

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        List<Integer> numbers = Arrays.stream(line.split(", "))
                .map(parser)
                .collect(Collectors.toList());

        int sum = Arrays.stream(line.split(", ")).mapToInt(Integer::parseInt).sum();

        System.out.println("Count: " + numbers.size());
        System.out.println("Sum: " + sum);


    }
}
