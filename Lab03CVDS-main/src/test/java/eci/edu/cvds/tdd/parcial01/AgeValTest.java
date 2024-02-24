package eci.edu.cvds.tdd.parcial01;

import org.junit.Assert;
import org.junit.Test;

public class AgeValTest {
    @Test
    public void valUnder(){
        AgeVal ageVal =  new AgeVal(17);

        Assert.assertEquals(true, ageVal.agenum());
    }
    @Test
    public void validateOverAge(){

        AgeVal ageVal =  new AgeVal(18);
        Assert.assertEquals(false, ageVal.agenum());
    }
    @Test
    public void validateLimitAge(){

        AgeVal ageVal =  new AgeVal(1000);
        Assert.assertEquals(false, ageVal.agenum());
    }
    @Test
    public void invalidateOverAge(){
        AgeVal ageVal =  new AgeVal(-18);
        Assert.assertEquals(false, ageVal.agenum());
    }
}
