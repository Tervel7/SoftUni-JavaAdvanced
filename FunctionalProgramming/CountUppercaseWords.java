package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords {
    public static void main(String[] args) {
  //    Predicate<String> isFirstLetterUppercase = s -> s.charAt(0) >= 'A' && s.charAt(0) <= 'Z';
        Predicate<String> isFirstLetterUppercase = s -> Character.isUpperCase(s.charAt(0));
        Consumer<String> print = System.out::println;

        Scanner scanner = new Scanner(System.in);
        List<String> uppercaseWord = Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(isFirstLetterUppercase)
                .collect(Collectors.toList());

        System.out.println("Count: " + uppercaseWord.size());
        uppercaseWord.forEach(print);
    }
}
