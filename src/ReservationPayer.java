public class ReservationPayer {

    private CreditCard creditCardDetails;
    private int id;

    public ReservationPayer(int id, CreditCard card) {
        if (card == null) {
            throw new IllegalArgumentException("Credit card required");
        }
        this.id = id;
        this.creditCardDetails = card;
    }

    public static ReservationPayer create(int id, CreditCard card) {
        return new ReservationPayer(id, card);
    }
}
