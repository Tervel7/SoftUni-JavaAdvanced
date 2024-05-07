package SetsAndMaps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] lineChars = scanner.nextLine().toCharArray();

        Map<Character, Integer> wordCounter = new TreeMap<>();

        for (char lineChar : lineChars) {
            wordCounter.putIfAbsent(lineChar, 0);
            wordCounter.put(lineChar, wordCounter.get(lineChar)+1);
        }

        for(Map.Entry<Character, Integer> entry : wordCounter.entrySet()) {
            System.out.println(entry);
        }

    }
}
