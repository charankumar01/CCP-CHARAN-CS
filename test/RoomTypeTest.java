import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class RoomTypeTest {

    @Test
    void testValidRoomType() {
        RoomType rt = new RoomType("Deluxe", 200);
        assertEquals("Deluxe", rt.getKind());
        assertEquals(200, rt.getCost());
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "   "})
    void testInvalidKind(String kind) {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new RoomType(kind, 100));
        assertEquals("Room type required", ex.getMessage());
    }

    @ParameterizedTest
    @ValueSource(doubles = {0, -10})
    void testInvalidCost(double cost) {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new RoomType("Deluxe", cost));
        assertEquals("Cost must be positive", ex.getMessage());
    }
}
