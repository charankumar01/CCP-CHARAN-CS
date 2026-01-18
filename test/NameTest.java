import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class NameTest {

    @Test
    void testValidName() {
        Name n = new Name("Ali");
        assertEquals("Ali", n.getValue());
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "   "})
    void testEmptyOrBlankName(String invalid) {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Name(invalid));
        assertEquals("Name cannot be empty", ex.getMessage());
    }

    @Test
    void testNullName() {
        assertThrows(IllegalArgumentException.class, () -> new Name(null));
    }
}
