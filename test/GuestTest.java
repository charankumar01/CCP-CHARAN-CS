import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GuestTest {

    @Test
    void testCreateGuestNormal() {
        Name name = new Name("Ali");
        Address address = new Address("Karachi");

        Guest guest = Guest.create(name, address);

        assertEquals("Ali", guest.getGuestName());
    }

    @Test
    void testNullNameThrows() {
        Address address = new Address("Karachi");
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Guest(null, address));
        assertEquals("Guest data cannot be null", ex.getMessage());
    }

    @Test
    void testNullAddressThrows() {
        Name name = new Name("Ali");
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Guest(name, null));
        assertEquals("Guest data cannot be null", ex.getMessage());
    }
}
