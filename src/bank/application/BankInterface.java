package bank.application;

public interface BankInterface {


    public String addMoney(int money);

    public int checkBalance(String password);

    public String withdrawMoney(int money, String password);

    public String updatePassword(String oldPassword, String newPassword);

    public double calculateRateOfInterest(int years, String Password);
}
