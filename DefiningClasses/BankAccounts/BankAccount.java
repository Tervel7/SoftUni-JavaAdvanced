package DefiningClasses.BankAccounts;

public class BankAccount {
    private int id;
    private static int accountCounter = 0;
    private double balance;
    private static double interestRate = 0.02;

    BankAccount() {
        accountCounter++;
        this.id = accountCounter;
        this.balance=0;
    }

    public static void setInterestRate(double interest) {
        interestRate = interest;
    }
    public double getInterest(int years) {
        return years * interestRate * this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public int getId() {
        return this.id;
    }

}
