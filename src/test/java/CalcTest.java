import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalcTest {

    Calc myCalc;

    @Before

    public void before(){
        myCalc = new Calc(57,13);
    }

    @Test

    public void canAddTwoNumbers() {
        assertEquals(70.0, myCalc.canAdd());
    }

    @Test

    public void canSubtractTwoNumbers(){
        assertEquals(44.0, myCalc.canSubtract());
    }

    @Test

    public void canMultipleTwoNumbers(){
        assertEquals(741.0, myCalc.canMultiple());
    }

    @Test

    public void canDivideTwoNumbers(){
        assertEquals(4.38, myCalc.canDivide());
    }
}
