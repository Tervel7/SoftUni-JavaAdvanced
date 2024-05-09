package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PositionOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        String[] arrayDimensions = line.split(", ");
        int rows = Integer.parseInt(arrayDimensions[0]);
        int cols = Integer.parseInt(arrayDimensions[1]);
        int[][] matrix = new int[rows][cols];

        for (int i =0; i<rows;i++) {
            int[] elements = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[i] = elements;
        }

        int searchedNumber = Integer.parseInt(scanner.nextLine());
        boolean foundIt = false;

        for (int i =0; i<rows;i++) {
            for (int j =0; j<cols; j++) {
                if (matrix[i][j]==searchedNumber) {
                    System.out.println(i + " " + j);
                    foundIt = true;
                }
            }
        }

        if(!foundIt)
            System.out.println("Not found");
    }
}
