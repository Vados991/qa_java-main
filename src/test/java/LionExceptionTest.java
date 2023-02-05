import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class LionExceptionTest {

    @Test
    public void lionSexHaveException() throws Exception {
        try {
            Feline feline = new Feline();
            Lion lion = new Lion(" ", feline);
            lion.doesHaveMane();
        } catch (Exception thrown) {
            assertNotEquals(" ", thrown.getMessage());
        }
    }
}
