package class_09_08;

import org.junit.Assert;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @org.junit.Test
    public void ret() {
        Assert.assertEquals( 5, calculator.ret(2,3) , .01);
        Assert.assertEquals( 24 , calculator.ret( 23,1 ) , .01 );
    }
}