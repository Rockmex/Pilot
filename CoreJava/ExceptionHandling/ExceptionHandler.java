package CoreJava.ExceptionHandling;

class CardTypeException extends Exception {
    public CardTypeException(String msg) {
        super(msg);
    }
}

class AddressException extends Exception {
    public AddressException(String msg) {
        super(msg);
    }
}

public class ExceptionHandler {
    public static void main(String[] args) {
        handleException("AMEX", "abc US");
        handleException("AMEXI", "abc US");
        handleException("AMEX", "abc CA");
        handleException("VISA", "123 CN");
    }

    public static void handleException(String cardType, String address) {
        try {
            if (!cardType.equals("AMEX")) {
                throw new CardTypeException("Card type is not AMEX");
            } else {
                System.out.println("CardType accepted!");
            }
            if (!address.contains("US")) {
                throw new AddressException("Address is outside US");
            } else {
                System.out.println("Address accepted!");
            }
        } catch (CardTypeException ex) {
            System.out.println(ex);
        } catch (AddressException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
