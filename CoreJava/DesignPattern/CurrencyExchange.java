package CoreJava.DesignPattern;

/*
* Problem: Create a factory pattern called “CurrencyExchange” which takes in the country name and return the currency object for that country.
* Note: The classes are incomplete. This is just for homework purposes.
* */

public class CurrencyExchange {
    public static class Dollar implements Currency {
        @Override
        public String getCurrency() {
            return "Dollar";
        }
    }

    public static class RMB implements Currency {
        @Override
        public String getCurrency() {
            return "RMB";
        }
    }

    public static class Euro implements Currency {
        @Override
        public String getCurrency() {
            return "Euro";
        }
    }

    public Currency getCountryCurrency(String country) {
        if ("US".equalsIgnoreCase(country)) {
            return new Dollar();
        }
        if ("China".equalsIgnoreCase(country)) {
            return new RMB();
        }
        if ("France".equalsIgnoreCase(country)) {
            return new Euro();
        }
        return null;
    }
}

