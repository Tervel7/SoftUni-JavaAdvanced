package ExamPrep;

import java.util.Scanner;

public class PastryShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dimensions = Integer.parseInt(scanner.nextLine());

        char[][] field = new char[dimensions][dimensions];

        int playerRow = -1;
        int playerCol = -1;

        for (int i = 0; i < dimensions; i++) {
            char[] input = scanner.nextLine().toCharArray();
            for (int j = 0; j < dimensions; j++) {

                field[i][j] = input[j];

                if (field[i][j]==('S')) {
                    field[i][j]='-';
                    playerRow = i;
                    playerCol = j;
                }

            }
        }

        String command = scanner.nextLine();
        int sum = 0;
        boolean outOfField = false;

        while(true) {

            switch (command) {
                case "up":
                    if(playerRow-1 >= 0) {
                        playerRow -= 1;
                        break;
                    } else {
                        field[playerRow][playerCol] = '-';
                        outOfField = true;
                        break;
                    }
                case "down":
                    if(playerRow+1 < dimensions) {
                        playerRow += 1;
                        break;
                    } else {
                        field[playerRow][playerCol] = '-';
                        outOfField = true;
                        break;
                    }
                case "left":
                    if(playerCol-1 >= 0) {
                        playerCol -= 1;
                        break;
                    } else {
                        field[playerRow][playerCol] = '-';
                        outOfField = true;
                        break;
                    }
                case "right":
                    if(playerCol+1 < dimensions) {
                        playerCol += 1;
                        break;
                    } else {
                        field[playerRow][playerCol] = '-';
                        outOfField = true;
                        break;
                    }
            }

            if(outOfField){
                field[playerRow][playerCol] = '-';
                System.out.println("Bad news! You're out of the pastry shop!");
                System.out.println("Money: " + sum);
                for (int i = 0; i < dimensions; i++) {
                    for (int j = 0; j < dimensions; j++) {
                        System.out.print(field[i][j]);
                    }
                    System.out.println();
                }
                break;
            }

            if(Character.isDigit(field[playerRow][playerCol])){
                sum += Character.getNumericValue(field[playerRow][playerCol]);
                field[playerRow][playerCol] = '-';
            }

            if(sum>=50){
                field[playerRow][playerCol] = 'S';
                System.out.println("Goods news! You succeed in collecting enough money!");
                System.out.println("Money: " + sum);
                for (int i = 0; i < dimensions; i++) {
                    for (int j = 0; j < dimensions; j++) {
                        System.out.print(field[i][j]);
                    }
                    System.out.println();
                }
                break;
            }

            if(field[playerRow][playerCol]=='P'){
                field[playerRow][playerCol] = '-';
                for (int i = 0; i < dimensions; i++) {
                    for (int j = 0; j < dimensions; j++) {
                        if (field[i][j]==('P')) {
                            field[i][j] = '-';
                            playerRow = i;
                            playerCol = j;
                        }
                    }
                }

            }

            command=scanner.nextLine();
        }

    }
}