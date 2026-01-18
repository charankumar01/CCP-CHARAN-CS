import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class AddressTest {

    @Test
    void testValidCity() {
        // Arrange
        String city = "Karachi";

        // Act
        Address address = new Address(city);

        // Assert
        assertEquals(city, address.getCity());
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "   "})
    void testEmptyOrBlankCity(String invalidCity) {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Address(invalidCity));
        assertEquals("City cannot be empty", ex.getMessage());
    }

    @Test
    void testNullCity() {
        assertThrows(IllegalArgumentException.class, () -> new Address(null));
    }
}
 