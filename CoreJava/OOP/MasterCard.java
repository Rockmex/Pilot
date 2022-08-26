package CoreJava.OOP;

public class MasterCard extends CreditCard{

    public MasterCard(String holderName, String cardNumber, Double accountBalance) {
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.accountBalance = accountBalance;
        this.cardType = "Master";
    }

    @Override
    boolean isCardAcceptable(String cardType) {
        return cardType.equalsIgnoreCase("Master");
    }
}
