package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
//        int dimensions = 5;
//        int[][] matrix = {
//                {1,2,3,4,5},
//                {1,2,3,4,5},
//                {1,2,3,4,5},
//                {1,2,3,4,5},
//                {1,2,3,4,5}
//        };

        Scanner scanner = new Scanner(System.in);
        int dimensions = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[dimensions][dimensions];

        for (int i=0;i<dimensions;i++) {
            int[] elements = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[i] = elements;
        }

        for (int i =0; i<dimensions; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        System.out.println();

        int index = 0;
        for (int i=dimensions; i>0; i--) {
            System.out.print(matrix[i-1][index] + " ");
            index++;
        }
    }
}
