package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        ArrayDeque<String> operations = new ArrayDeque<>();
        Collections.addAll(operations, input);

        while(operations.size()>1) {
            int num1 = Integer.parseInt(operations.pop());
            String operator = operations.pop();
            int num2 = Integer.parseInt(operations.pop());

            if (operator.equals("+")) operations.push(String.valueOf((num1+num2)));
            if (operator.equals("-")) operations.push(String.valueOf(num1-num2));
        }
        System.out.println(operations.peek());
    }
}
