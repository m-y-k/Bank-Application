package bank.application;

import java.util.UUID;

public class ICICI implements BankInterface{
    private int balance;
    private String accountNo;
    private String password;

    public String name;
    public static int rateOfInterest;

    public ICICI(int balance, String name, String password) {
        this.accountNo = UUID.randomUUID().toString();
        this.balance = balance;
        this.name = name;
        this.password = password;
    }

    @Override
    public String addMoney(int money) {
        this.balance += money;

        String message = "Rs " + money + " added to account " + accountNo + "Total balance is " + balance;

        return message;
    }

    @Override
    public int checkBalance(String password) {
        if (this.password.equals(password)) {
            return balance;
        }
        return -1;
    }

    @Override
    public String withdrawMoney(int money, String password) {
        if (this.password.equals(password)) {
            balance -= money;
            String message = money + " deducted from your account successfully";
            return message;
        }
        return "incorrect password";
    }

    @Override
    public String updatePassword(String oldPassword, String newPassword) {
        if (this.password == oldPassword) {
            this.password = newPassword;
            String message = "Password updated";
            return message;
        }
        return "incorrect password";
    }

    @Override
    public double calculateRateOfInterest(int years, String Password) {
        double interest = balance * rateOfInterest * years / 100;
        return interest;
    }
}
