package CoreJava.Java8;

public abstract class CreditCard {
    String holderName;
    String cardNumber;
    double accountBalance;
    String cardType;

    abstract boolean isCardAcceptable(String cardType);

    void payBill(double bill) {
        if (accountBalance < bill) {
            System.out.println("Insufficient Balance");
        } else {
            accountBalance -= bill;
            System.out.println("Paid successfully. Remaining balance: " + accountBalance);
        }
    }

    static void refund(double amount) {
        System.out.println("Called refund Method, amount passed: " + amount);
    }
}
