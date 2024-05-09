package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        String[][] firstMatrix = new String[rows][cols];
        String[][] secondMatrix = new String[rows][cols];
        String[][] commonElementsMatrix = new String[rows][cols];

        for (int i=0; i<rows; i++) {
            String[] elements = scanner.nextLine().split(", ");
            firstMatrix[i] = elements;
        }

        for (int i=0; i<rows; i++) {
            String[] elements = scanner.nextLine().split(", ");
            secondMatrix[i] = elements;
        }

        for (int i = 0; i<rows; i++) {
            for (int j = 0; j<cols; j++) {
                if(firstMatrix[i][j].equals(secondMatrix[i][j]))
                    commonElementsMatrix[i][j] = firstMatrix[i][j];
                else
                    commonElementsMatrix[i][j] = "*";
            }
        }

        for (int i= 0; i<rows; i++) {
            for (int j = 0; j<cols; j++){
                System.out.print(commonElementsMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
