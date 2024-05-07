package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] kids = scanner.nextLine().split(" ");
        int numberOfTurns = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, kids);

        while(queue.size()>1) {
            for (int i=1;i<numberOfTurns;i++) queue.offer(queue.poll());
            System.out.println("removed: " + queue.poll());
        }
        System.out.println("winner: " + queue.peek());
    }
}
