package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AddVAT {
    public static void main(String[] args) {
    //  Function<Double, Double> addVAT = d -> d + (d*0.2);
        UnaryOperator<Double> addVAT = d -> d + (d*0.2);
        Consumer<Double> print = System.out::println;

        Scanner scanner = new Scanner(System.in);
        List<Double> pricesAfterVAT = Arrays.stream(scanner.nextLine().split(", "))
                .map(Double::parseDouble)
                .map(addVAT)
                .collect(Collectors.toList());
        
        pricesAfterVAT.forEach(print);

    }
}
