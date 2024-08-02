package bankaccountapp;

public abstract class Account implements IBaseRate {

    private String name;
    private String sSn;
    protected String accountNumber;
    private double balance;
    protected double rate;
    private static int index = 1000;

    // list common properties for saving and checking accounts
    // list common methods

    public Account(String name, String sSN, double initDeposit) {
        // System.out.println("name : " + name);
        // System.out.println("new account");
        this.name = name;
        this.sSn = sSN;
        balance = initDeposit;
        // System.out.println("name : " + name + " SSN : " + sSn + " Balance : rs" +
        // balance);

        // set account number
        index++;
        this.accountNumber = setAccountNumber();
        // System.out.println("Account number " + this.accountNumber);
        setRate();

    }

    public abstract void setRate();

    private String setAccountNumber() {
        String lastTwoOfSSN = sSn.substring(sSn.length() - 2, sSn.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 2));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    public void compound() {
        double accuredInterest = balance * (rate / 100);
        balance = balance + accuredInterest;
        System.out.println("Accured Interest : Rs " + accuredInterest);
        printBalance();
    }

    public void Deposit(double amount) {
        balance = balance + amount;
        System.out.println("Depositing Rs " + amount);
        printBalance();
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdrawing Rs " + amount);
        printBalance();
    }

    public void transfer(String toWhere, double amount) {
        balance = balance - amount;
        System.out.println("Transfer Rs " + amount + "to  " + toWhere);
        printBalance();

    }

    public void printBalance() {
        System.out.println("Your Balance is Rs " + balance);
    }

    public void showInfo() {
        System.out.println(
                "Name : " + name +
                        "\nAccount Number : " + accountNumber +
                        "\nBalance : " + balance +
                        "\nRate : " + rate + "%");
    }

}
