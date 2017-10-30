import org.junit.*;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before CalculatorTest.class");
    }

    @AfterClass
    public  static void afterClass() {
        System.out.println("After CalculatorTest.class");
    }

    @Before
    public void initTest(){
        calculator =  new Calculator();
    }

    @After
    public void afterTest(){
        calculator = null;
    }
    @Test
    public void getSum() throws Exception {
        assertEquals(22, calculator.getSum(7,15));
    }



    @Test
    public void getDivide() throws Exception {
        assertEquals(30, calculator.getDivide(90,3));
    }

    @Test
    public void getMultiple() throws Exception {

    }

    @Test(expected = ArithmeticException.class)
    public void divisionWithException() {
        calculator.getDivide(15,0);
    }

    @Test(timeout = 500)
    public void timeStampTest() {
        while (true);
    }

}