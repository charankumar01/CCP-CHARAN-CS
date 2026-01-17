public class CreditCard {
    private String cardNumber;

    public CreditCard(String cardNumber) {
        if (cardNumber == null || cardNumber.length() < 10) {
            throw new IllegalArgumentException("Invalid card number");
        }
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }
}
