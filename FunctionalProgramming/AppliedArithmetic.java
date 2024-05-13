package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        UnaryOperator<List<Integer>> add = arr -> arr.stream().map(a -> a+1).collect(Collectors.toList());
        UnaryOperator<List<Integer>> subtract = arr -> arr.stream().map(a -> a-1).collect(Collectors.toList());
        UnaryOperator<List<Integer>> multiply = arr -> arr.stream().map(a -> a*2).collect(Collectors.toList());

        String command = scanner.nextLine();
        while(!command.equals("end")) {
            switch (command) {
                case "add" -> numbers = add.apply(numbers);
                case "subtract" -> numbers = subtract.apply(numbers);
                case "multiply" -> numbers = multiply.apply(numbers);
                case "print" -> System.out.println(numbers);
            }
            command = scanner.nextLine();
        }

    }
}
