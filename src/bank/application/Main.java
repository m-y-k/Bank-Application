package bank.application;

public class Main {
    public static void main(String[] args) {

        SBI.rateOfInterest = 8;
        ICICI.rateOfInterest = 7;

        SBI yusuf = new SBI(50000, "Yusuf", "1234");
        SBI arham = new SBI(40000, "Arham", "2345");
        ICICI suboor = new ICICI(70000, "Suboor", "3456");

        System.out.println(yusuf.addMoney(5000));
        System.out.println(arham.addMoney(5000));
        System.out.println(suboor.addMoney(5000));

        System.out.println(yusuf.checkBalance("567"));
        System.out.println(arham.checkBalance("2345"));
        System.out.println(suboor.checkBalance("3456"));

        System.out.println(yusuf.withdrawMoney(6000, "1234"));
        System.out.println(arham.withdrawMoney(4000, "2345"));
        System.out.println(suboor.withdrawMoney(17000, "3456"));

        System.out.println(arham.updatePassword("1345","1234"));
        System.out.println(arham.updatePassword("2345","1234"));
        System.out.println(suboor.updatePassword("3456","1234"));

        System.out.println(yusuf.calculateRateOfInterest(20, "1234"));
        System.out.println(arham.calculateRateOfInterest(20, "1234"));
        System.out.println(suboor.calculateRateOfInterest(20, "1234"));
    }
}