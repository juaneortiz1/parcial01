package eci.edu.cvds.tdd.parcial01;



import java.util.HashSet;
import java.util.Set;

public class AgeVal {
private int p;
    public AgeVal(int p){
        this.p = p;
    }
    public boolean agenum( ) throws ExcepcionParametrosInvalidosPar {
        if(p < 0){
            throw new ExcepcionParametrosInvalidosPar("Los parametros no pueden ser negativos o nulos");
        }
        else if (p < 18 && p >= 0){
            return true;
        }
        else
            return false;
    }

}
