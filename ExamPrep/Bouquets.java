package ExamPrep;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Bouquets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(", ");
        ArrayDeque<Integer> tulips = new ArrayDeque<>();
        for (String s : line) {
            tulips.push(Integer.parseInt(s));
        }

        line = scanner.nextLine().split(", ");
        ArrayDeque<Integer> daffodils = new ArrayDeque<>();
        for (String s : line) {
            daffodils.offer(Integer.parseInt(s));
        }

        int bouquetCount = 0;
        int storedFlowers = 0;

        while(!tulips.isEmpty() && !daffodils.isEmpty()) {
            int tulip = tulips.pop();
            int daffodil = daffodils.peek();

            if(tulip+daffodil==15) {
                bouquetCount++;
                daffodils.poll();
            }else if(tulip+daffodil>15) {
                tulip -= 2;
                tulips.push(tulip);
            } else {
                storedFlowers += tulip+daffodil;
                daffodils.poll();
            }
        }

        if(storedFlowers>0)
            bouquetCount += storedFlowers/15;

        if(bouquetCount>=5)
            System.out.println("You made it. You go to the competition with " + bouquetCount + " bouquets!");
        else
            System.out.println("You failed... you need " + (5-bouquetCount) + " more bouquets.");
    }
}
