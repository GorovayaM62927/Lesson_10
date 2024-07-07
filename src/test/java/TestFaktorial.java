
import org.testng.annotations.Test;

import org.testng.Assert;


    import java.math.BigInteger;
import static org.example.Main.getFactorial;
public class TestFaktorial {

        @Test
        public void testFaktorial() {
            Assert.assertEquals(BigInteger.valueOf(1), getFactorial(0));
        }

        @Test
        public void testFaktorialOne() {
            Assert.assertEquals(BigInteger.valueOf(1), getFactorial(1));
        }

        @Test
        public void testFaktorialTwo() {
            Assert.assertEquals(BigInteger.valueOf(120), getFactorial(5));
        }

        @Test
        void testFaktorialNot() {
            IllegalAccessException exception = Assert.assertThrows(IllegalAccessException.class, () -> getFactorial(-1));
            Assert.assertEquals("exception", exception.getMessage());
        }
}


