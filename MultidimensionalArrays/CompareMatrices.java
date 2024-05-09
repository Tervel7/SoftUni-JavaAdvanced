package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        String[] firstMatrixDimensions = line.split(", ");
        int firstMatrixRows = Integer.parseInt(firstMatrixDimensions[0]);
        int firstMatrixCols = Integer.parseInt(firstMatrixDimensions[1]);
        int[][] firstMatrix = new int[firstMatrixRows][firstMatrixCols];

        for (int i=0; i<firstMatrixRows; i++) {
            int[] elements = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
            firstMatrix[i] = elements;
        }

        line= scanner.nextLine();

        String[] secondMatrixDimensions = line.split(", ");
        int secondMatrixRows = Integer.parseInt(secondMatrixDimensions[0]);
        int secondMatrixCols = Integer.parseInt(secondMatrixDimensions[1]);
        int[][] secondMatrix = new int[secondMatrixRows][secondMatrixCols];

        for (int i=0; i<secondMatrixRows; i++) {
            int[] elements = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            secondMatrix[i] = elements;
        }

        boolean equal = true;
        if(firstMatrixRows == secondMatrixRows && firstMatrixCols == secondMatrixCols) {
            for (int i =0; i<firstMatrixRows; i++) {
                for (int j=0; j<firstMatrixCols; j++) {
                    if (firstMatrix[i][j]!=secondMatrix[i][j]) {
                        equal = false;
                        break;
                    }
                }
            }
        }

        System.out.println(equal? "equal" : "not equal");
    }
}
