import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {

    @Test
    void testValidCard() {
        CreditCard c = new CreditCard("1234567890");
        assertEquals("1234567890", c.getCardNumber());
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "123", "123456789"})
    void testInvalidCard(String invalidCard) {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new CreditCard(invalidCard));
        assertEquals("Invalid card number", ex.getMessage());
    }

    @Test
    void testNullCard() {
        assertThrows(IllegalArgumentException.class, () -> new CreditCard(null));
    }
}
