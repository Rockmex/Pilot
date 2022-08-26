package CoreJava.OOP;

public class VisaCard extends CreditCard{

    public VisaCard(String holderName, String cardNumber, Double accountBalance) {
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.accountBalance = accountBalance;
        this.cardType = "Visa";
    }

    @Override
    boolean isCardAcceptable(String cardType) {
        return cardType.equalsIgnoreCase("Visa");
    }
}
