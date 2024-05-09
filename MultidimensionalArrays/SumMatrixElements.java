package MultidimensionalArrays;

import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        String[] arrayDimensions = line.split(", ");
        int rows = Integer.parseInt(arrayDimensions[0]);
        int cols = Integer.parseInt(arrayDimensions[1]);
        int[][] matrix = new int[rows][cols];

        int sum = 0;

        for(int i=0;i< rows;i++){
            line = scanner.nextLine();
            String[] arrayElements = line.split(", ");
            for(int j =0; j<cols; j++) {
                //    int currElement = Integer.parseInt(arrayElements[j]);
                matrix[i][j] = Integer.parseInt(arrayElements[j]);
                sum += Integer.parseInt(arrayElements[j]);
            }
        }

        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);

    }
}
