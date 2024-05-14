package DefiningClasses.BankAccounts;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, BankAccount> bankAccounts = new LinkedHashMap<>();

        String line = scanner.nextLine();

        while(!line.equals("End")) {
            String[] commands = line.split("\\s+");

            switch (commands[0]) {
                case "Create":
                    BankAccount bankAccount = new BankAccount();
                    bankAccounts.put(String.valueOf(bankAccount.getId()), bankAccount);
                    System.out.println("Account ID" + bankAccount.getId() + " created.");
                    break;
                case "Deposit":
                    if(bankAccounts.containsKey(commands[1])) {
                        bankAccounts.get(commands[1]).deposit(Integer.parseInt(commands[2]));
                        System.out.println("Deposited " + commands[2] + " to ID" + commands[1]);
                        break;
                    } else {
                        System.out.println("Account doesn't exist!");
                        break;
                    }
                case "SetInterest":
                    BankAccount.setInterestRate(Double.parseDouble(commands[1]));
                    break;
                case "GetInterest":
                    if(bankAccounts.containsKey(commands[1])) {
                        System.out.println(bankAccounts.get(commands[1]).getInterest(Integer.parseInt(commands[2])));
                        break;
                    } else
                        System.out.println("Account doesn't exist!");
            }


            line = scanner.nextLine();
        }
    }
}
