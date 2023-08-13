package Chapter_Five;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static Constants.Constant.*;
public class TaxReturnTest {
    TaxReturn tax = new TaxReturn(1000, SINGLE );
    @Test
    public void getTax() {
        Assert.assertEquals(100.0,tax.getTax() , .0);
        Assert.assertEquals(100.1,tax.getTax() , .1);
        Assert.assertEquals(99.9,tax.getTax() , .1);
    }
}