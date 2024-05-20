package ExamPrep;

import java.util.Scanner;

public class Python {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dimensions = Integer.parseInt(scanner.nextLine());
        char[][] field = new char[dimensions][dimensions];

        String[] moves = scanner.nextLine().split(", ");

        int playerRow = -1;
        int playerCol = -1;
        int playerLength = 1;

        for (int i = 0; i < dimensions; i++) {
            char[] input = scanner.nextLine().toCharArray();
            for (int j = 0; j < dimensions; j++) {
                if(input[j] == 's'){
                    playerRow = i;
                    playerCol = j;
                }
                field[i][j] = input[j];
            }
        }

        boolean killedByEnemy = false;
        boolean foodLeft = false;

        for (String move:moves) {

            switch (move) {
                case "up":
                    if(playerRow-1>=0)
                        playerRow -= 1;
                    else
                        playerRow = dimensions-1;
                    break;

                case "down":
                    if(playerRow+1<dimensions)
                        playerRow += 1;
                    else
                        playerRow = 0;
                    break;

                case "left":
                    if(playerCol-1>=0)
                        playerCol -= 1;
                    else
                        playerCol = dimensions-1;
                    break;

                case "right":
                    if(playerCol+1<dimensions)
                        playerCol += 1;
                    else
                        playerCol = 0;
                    break;
            }

            if(field[playerRow][playerCol]=='f'){
                field[playerRow][playerCol] = '*';
                playerLength++;
            }

            if(foodLeft(field)>0){
                foodLeft = true;
            } else {
                foodLeft = false;
                break;
            }

            if(field[playerRow][playerCol] == 'e') {
//                System.out.println("You lose! Killed by an enemy.");
                killedByEnemy = true;
                break;
            }
        }

        if(killedByEnemy) {
            System.out.println("You lose! Killed by an enemy.");
        }
        else if (foodLeft)
            System.out.println("You lose! There is still " + foodLeft(field) +  " food to be eaten.");
        else
            System.out.println("You win! Final python length: " + playerLength);

    }

    private static int foodLeft(char[][] field) {
        int foodCount = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == 'f'){
                    foodCount++;
                }
            }
        }
        return foodCount;
    }
}
