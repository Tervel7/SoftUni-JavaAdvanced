package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinaryConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimalNumber = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Byte> binaryNumber = new ArrayDeque<>();

        if(decimalNumber==0){
            System.out.println(0);
        } else  {
            while(decimalNumber!=0) {
                binaryNumber.push((byte)(decimalNumber%2));
                decimalNumber /= 2;
            }

            for (Byte b : binaryNumber) {
                System.out.print(b);
            }
        }
    }
}
