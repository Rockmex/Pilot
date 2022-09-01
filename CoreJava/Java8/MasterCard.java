package CoreJava.Java8;

public class MasterCard extends CreditCard{

    public MasterCard(String holderName, String cardNumber, double accountBalance, String cardType) {
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.accountBalance = accountBalance;
        this.cardType = cardType;
    }

    @Override
    boolean isCardAcceptable(String cardType) {
        return cardType.equalsIgnoreCase("Master");
    }
}
