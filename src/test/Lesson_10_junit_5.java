import org.junit.jupiter.api.Test;
import org.junit.Assert;

import java.math.BigInteger;
import static org.example.Main.getFactorial;
public class Lesson_10_junit_5 {

    @Test
    public void testFactorial() {
        Assert.assertEquals(BigInteger.valueOf(1), getFactorial(0));
    }
    @Test
    public void testFactorialOne() {
        Assert.assertEquals(BigInteger.valueOf(1), getFactorial(1));
    }
    @Test
    public void testFactorialTwo() {
        Assert.assertEquals(BigInteger.valueOf(120), getFactorial(5));
    }
    @Test
    void testFactorialNot() {
        IllegalAccessException exception = Assert.assertThrows(IllegalAccessException.class, () -> getFactorial(-1));
        Assert.assertEquals("exception", exception.getMessage());
    }
}

