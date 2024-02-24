package eci.edu.cvds.tdd.parcial01;

import org.junit.Assert;
import org.junit.Test;

public class AgeValTest {
    @Test
    public void valUnder() throws ExcepcionParametrosInvalidosPar {
        AgeVal ageVal =  new AgeVal(17);

        Assert.assertEquals(true, ageVal.agenum());
    }
    @Test
    public void valz() throws ExcepcionParametrosInvalidosPar {
        AgeVal ageVal =  new AgeVal(0);

        Assert.assertEquals(true, ageVal.agenum());
    }
    @Test
    public void validateOverAge() throws ExcepcionParametrosInvalidosPar {

        AgeVal ageVal =  new AgeVal(18);
        Assert.assertEquals(false, ageVal.agenum());
    }
    @Test
    public void validateLimitAge() throws ExcepcionParametrosInvalidosPar {

        AgeVal ageVal =  new AgeVal(1000);
        Assert.assertEquals(false, ageVal.agenum());
    }
    @Test
    public void invalidateOverAge(){
        AgeVal ageVal =  new AgeVal(-18);
        try{
            Assert.assertEquals(false, ageVal.agenum());
        } catch (ExcepcionParametrosInvalidosPar e){
            Assert.assertEquals("Los parametros no pueden ser negativos o nulos",e.getMessage());
        }
    }
}
