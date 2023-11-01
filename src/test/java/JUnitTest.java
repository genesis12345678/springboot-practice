import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class JUnitTest {
    @DisplayName("1 + 2 = 3")
    @Test
    public void junitTest() {
        int a = 1;
        int b = 2;
        int sum = 3;
        assertThat(a + b).isEqualTo(sum);
    }

    @DisplayName("1 + 3 = 4")
    @Test
    public void junitFailedTest() {
        int a = 1;
        int b = 3;
        int sum = 3;

        assertEquals(a + b, sum);
    }
}

