package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ArrayDeque<String> files = new ArrayDeque<>();

        while(!(input.equals("print"))) {
            if(input.equals("cancel")) {
                if(files.isEmpty()) System.out.println("printer is on standby");
                else System.out.println(files.remove() + " canceled printing");
            } else {
                files.offer(input);
            }
            input= scanner.nextLine();
        }
        for (String file : files) {
            System.out.println(file);
        }

    }
}
