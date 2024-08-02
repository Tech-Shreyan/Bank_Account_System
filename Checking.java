package bankaccountapp;

//import javax.print.event.PrintJobListener;

public class Checking extends Account {

    private int debitCardNumber;
    private int debitCardPin;

    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;
        // System.out.println("Account number " + this.accountNumber);
        // System.out.println("new checking account");
        // System.out.println("Name : " + name);
        setDebitCard();
    }

    @Override
    public void setRate() {
        System.out.println("Implement rate for checking ");
        rate = getBaseRate() * .15;
    }

    private void setDebitCard() {
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPin = (int) (Math.random() * Math.pow(10, 4));
        // System.out.println("Card : " + debitCardNumber);
        // System.out.println("Pin :" + debitCardPin);
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Checking Account Details " +
                "\n Debit Card NUmber : " + debitCardNumber +
                "\n Debit Card Pin :" + debitCardPin);

    }

}
