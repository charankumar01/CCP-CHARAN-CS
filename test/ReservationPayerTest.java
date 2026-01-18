import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReservationPayerTest {

    @Test
    void testValidPayer() {
        CreditCard c = new CreditCard("1234567890");
        ReservationPayer rp = ReservationPayer.create(1, c);
        assertNotNull(rp);
    }

    @Test
    void testNullCardThrows() {
        assertThrows(IllegalArgumentException.class, () -> new ReservationPayer(1, null));
    }
}
