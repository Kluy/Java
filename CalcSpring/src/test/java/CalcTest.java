import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTest {
    Calc calc = new Calc();


    @Before
    public void setUp() {
        calc.setA(2);
        calc.setB(3);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void plus() {
        int c = calc.plus(calc.getA(),calc.getB());
        assertEquals(5, c);
    }

    @Test
    public void pow() {
        int c = calc.pow(calc.getA(),calc.getB());
        assertEquals(6, c);
    }
}