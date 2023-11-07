import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CalculatorTest {
    private Main calculator;

    @Before
    public void setUp() {
        calculator = new Main();
    }

    @Test
    public void test_add_positive() {
        double a = 1;
        double b = 2;
        double expectedResult = 3;
        Assert.assertEquals(expectedResult, calculator.add(a, b), 0.001); // Using delta for double comparison
    }

    @Test
    public void test_add_negative() {
        double a = 1;
        double b = 2;
        double expectedResult = 0;
        Assert.assertNotEquals(expectedResult, calculator.add(a, b), 0.001);
    }

    @Test
    public void test_subtract_positive() {
        double a = 3;
        double b = 2;
        double expectedResult = 1;
        Assert.assertEquals(expectedResult, calculator.subtract(a, b), 0.001);
    }

    @Test
    public void test_subtract_negative() {
        double a = 3;
        double b = 2;
        double expectedResult = 0;
        Assert.assertNotEquals(expectedResult, calculator.subtract(a, b), 0.001);
    }

    @Test
    public void test_multiply_positive() {
        double a = 3;
        double b = 2;
        double expectedResult = 6;
        Assert.assertEquals(expectedResult, calculator.multiply(a, b), 0.001);
    }

    @Test
    public void test_multiply_negative() {
        double a = 3;
        double b = 2;
        double expectedResult = 5;
        Assert.assertNotEquals(expectedResult, calculator.multiply(a, b), 0.001);
    }

    @Test
    public void test_divide_positive() {
        double a = 6;
        double b = 2;
        double expectedResult = 3;
        Assert.assertEquals(expectedResult, calculator.divide(a, b), 0.001);
    }

    @Test
    public void test_divide_negative() {
        double a = 6;
        double b = 2;
        double expectedResult = 4;
        Assert.assertNotEquals(expectedResult, calculator.divide(a, b), 0.001);
    }

    @After
    public void tearDown() {
        calculator = null;
    }
}