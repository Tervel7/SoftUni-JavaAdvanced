package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor {
    public static void main(String[] args) {
        Consumer<String> knightGenerator = s -> System.out.println("Sir " + s);

        Scanner scanner = new Scanner(System.in);
        Arrays.stream(scanner.nextLine().split(" ")).forEach(knightGenerator);

    }
}
