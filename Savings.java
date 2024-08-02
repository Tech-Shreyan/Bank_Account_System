package bankaccountapp;

public class Savings extends Account {

    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        // System.out.println("Account number " + this.accountNumber);
        // System.out.println("new savings account");
        // System.out.println(name);
        setSafetyDepositBox();
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
        // System.out.println(safetyDepositBoxID);
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Savings Account Features " +
                "\n Safety Deposit Box ID : " + safetyDepositBoxID +
                "\n Safety Deposit Box Key :" + safetyDepositBoxKey);

    }

    @Override
    public void setRate() {
        // TODO Auto-generated method stub
        System.out.println("Implement rate for savings ");
        rate = getBaseRate() - 0.25;

    }

}
