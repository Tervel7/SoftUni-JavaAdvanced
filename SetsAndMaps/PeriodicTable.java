package SetsAndMaps;

import java.util.*;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();

        Set<String> elements = new TreeSet<>();

        for (int i =0; i<counter; i++) {
            String[] toAdd = scanner.nextLine().split(" ");
            elements.addAll(List.of(toAdd));
        }

        for (String element : elements) {
            System.out.println(element);
        }
    }
}
