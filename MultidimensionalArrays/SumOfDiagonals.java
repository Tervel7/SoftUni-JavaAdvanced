package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dimensions = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[dimensions][dimensions];

        for(int i=0; i<dimensions; i++) {
            int[] elements = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[i] = elements;
        }

        int sumPrimaryDiagonal = 0;
        int sumSecondaryDiagonal = 0;

        for(int i=0; i<dimensions; i++)
            sumPrimaryDiagonal += matrix[i][i];

        int index =0;
        for (int i=dimensions-1; i>=0; i--)
            sumSecondaryDiagonal += matrix[index++][i];

        if(sumPrimaryDiagonal == sumSecondaryDiagonal)
            System.out.println("The sum is equal = " + sumPrimaryDiagonal);
        else
            System.out.println("Not equal, diff = " + (sumPrimaryDiagonal>sumSecondaryDiagonal? sumPrimaryDiagonal-sumSecondaryDiagonal : sumSecondaryDiagonal-sumPrimaryDiagonal));
    }
}
