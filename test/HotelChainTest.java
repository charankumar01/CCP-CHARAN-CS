import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HotelChainTest {

    @Test
    void testAddHotel() {
        HotelChain chain = new HotelChain("Luxury");
        Hotel h = new Hotel(new Name("Grand"));
        chain.addHotel(h);
        assertNotNull(h);
    }

    @Test
    void testCreateReservationPayer() {
        HotelChain chain = new HotelChain("Luxury");
        CreditCard card = new CreditCard("1234567890");
        ReservationPayer payer = chain.createReservationPayer(1, card);
        assertNotNull(payer);
    }
}
