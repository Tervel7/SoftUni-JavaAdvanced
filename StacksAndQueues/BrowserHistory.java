package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        ArrayDeque<String> urls = new ArrayDeque<>();

        while(!(command.equals("Home"))) {

            if(command.equals("back")){
                if(urls.size()<=1) System.out.println("no previous URLs");
                else {
                    urls.pop();
                    System.out.println(urls.peek());
                }
            } else {
                urls.push(command);
                System.out.println(urls.peek());
            }
            command = scanner.nextLine();
        }
    }
}
