import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

class ReservationTest {

    @Test
    void testValidReservation() {
        Date now = new Date();
        Date start = new Date(now.getTime() + 1000);
        Date end = new Date(now.getTime() + 2000);

        Reservation r = Reservation.create(now, start, end, 1);
        assertNotNull(r);
    }

    @Test
    void testInvalidDateRangeThrows() {
        Date now = new Date();
        Date start = new Date(now.getTime() + 2000);
        Date end = new Date(now.getTime() + 1000);

        assertThrows(IllegalArgumentException.class, () -> new Reservation(now, start, end, 1));
    }

    @Test
    void testNullDatesThrows() {
        Date now = new Date();
        Date start = new Date();
        Date end = new Date();
        assertThrows(IllegalArgumentException.class, () -> new Reservation(null, start, end, 1));
        assertThrows(IllegalArgumentException.class, () -> new Reservation(now, null, end, 1));
        assertThrows(IllegalArgumentException.class, () -> new Reservation(now, start, null, 1));
    }
}
