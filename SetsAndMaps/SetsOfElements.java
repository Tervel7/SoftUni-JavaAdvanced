package SetsAndMaps;

import java.util.*;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] countOfSets = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();
        Set<Integer> commonElements = new LinkedHashSet<>();

        for (int i=0; i<countOfSets[0]; i++)
            firstSet.add(Integer.parseInt(scanner.nextLine()));

        for (int i=0; i<countOfSets[1]; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            secondSet.add(num);
            if(firstSet.contains(num))
                commonElements.add(num);
        }

        commonElements.forEach(System.out::print);


    }
}
