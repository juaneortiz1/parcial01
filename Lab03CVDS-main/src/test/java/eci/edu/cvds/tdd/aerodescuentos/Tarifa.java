package eci.edu.cvds.tdd.aerodescuentos;
import edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos;

public class Tarifa {
    public static long calculoTarifa(double tarifaBase, int diasAntelacion, int edad) throws ExcepcionParametrosInvalidos {

        if (tarifaBase <= 0 || diasAntelacion < 0 || edad < 0) {
            throw new ExcepcionParametrosInvalidos("Los parametros no pueden ser negativos o nulos");
        }
        else if (edad > 110) {
            throw new ExcepcionParametrosInvalidos("La edad no puede ser superior a 110");
        }

        double tarifaConDescuento = calcularTarifaConDescuento(tarifaBase, diasAntelacion, edad);
        return Math.round(tarifaConDescuento); // Redondeamos al entero más cercano
    }

    private static double calcularTarifaConDescuento(double tarifaBase, int diasAntelacion, int edad) {
        return CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
    }
}

