package MultidimensionalArrays;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dimensions = Integer.parseInt(scanner.nextLine());

        int[][] matrix = patternB(dimensions);
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int i=0; i< matrix.length; i++) {
            for (int j=0; j< matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] patternA(int dimensions) {
        int[][] matrix = new int[dimensions][dimensions];

        int x = 1;
        for (int i=0; i<dimensions;i++) {
            for (int j=0;j<dimensions;j++)
                matrix[j][i] = x++;
        }

        return matrix;
    }

    static int[][] patternB(int dimensions) {
        int[][] matrix = new int[dimensions][dimensions];

        int x = 1;

        for (int i=0; i<dimensions;i++) {
            if(i%2==0){
                for (int j=0;j<dimensions;j++)
                    matrix[j][i] = x++;
            } else {
                for (int j=dimensions-1; j>=0;j--)
                    matrix[j][i] = x++;
            }
        }

        return matrix;
    }
}
