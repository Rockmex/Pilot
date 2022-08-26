package CoreJava.OOP;

abstract class CreditCard {
    protected String holderName;
    protected String cardNumber;
    protected double accountBalance;
    protected String cardType;

    abstract boolean isCardAcceptable(String cardType);

    public void payBill(double bill) {
        if (accountBalance < bill) {
            System.out.println("Insufficient balance!");
        } else {
            accountBalance -= bill;
        }
    }
}
