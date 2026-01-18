import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void testValidRoomNumber() {
        Room r = new Room(101);
        assertEquals(101, r.getNumber());
        assertFalse(r.isOccupied());
    }

    @ParameterizedTest
    @ValueSource(ints = {0, -1, -100})
    void testInvalidRoomNumber(int number) {
        assertThrows(IllegalArgumentException.class, () -> new Room(number));
    }

    @Test
    void testAssignGuest() {
        Room r = new Room(101);
        Guest g = Guest.create(new Name("Ali"), new Address("Karachi"));
        boolean assigned = r.createGuest(g);
        assertTrue(assigned);
        assertTrue(r.isOccupied());
    }

    @Test
    void testAssignNullGuest() {
        Room r = new Room(101);
        boolean assigned = r.createGuest(null);
        assertFalse(assigned);
        assertFalse(r.isOccupied());
    }

    @Test
    void testAssignOccupiedRoom() {
        Room r = new Room(101);
        Guest g1 = Guest.create(new Name("Ali"), new Address("Karachi"));
        Guest g2 = Guest.create(new Name("Ahmed"), new Address("Lahore"));
        r.createGuest(g1);
        assertFalse(r.createGuest(g2));
    }
}

