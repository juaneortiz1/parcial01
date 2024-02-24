package eci.edu.cvds.tdd.aerodescuentos;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TarifaTest {

    @Test
    public void testCalculoTarifaClase1() {
        double tarifaBase = 100;
        int diasAntelacion = 30;
        int edad = 25;
        double resultadoEsperado = 85;
        try {
            double tarifaCalculada = Tarifa.calculoTarifa(tarifaBase, diasAntelacion, edad);
            assertEquals(resultadoEsperado, tarifaCalculada, 0.01); // Usamos delta para comparar valores decimales
        } catch (ExcepcionParametrosInvalidos e) {
            fail("excepcion inesperada: " + e.getMessage());
        }
    }

    @Test(expected = ExcepcionParametrosInvalidos.class)
    public void testCalculoTarifaClase2() throws ExcepcionParametrosInvalidos {
        Tarifa.calculoTarifa(-50, 20, 30);
    }

    @Test(expected = ExcepcionParametrosInvalidos.class)
    public void testCalculoTarifaClase3() throws ExcepcionParametrosInvalidos {
        Tarifa.calculoTarifa(200, -10, 40);
    }

    @Test(expected = ExcepcionParametrosInvalidos.class)
    public void testCalculoTarifaClase4() throws ExcepcionParametrosInvalidos {
        Tarifa.calculoTarifa(150, 25, -5);
    }

    @Test
    public void testCalculoTarifaConFronteras() {
        // Caso 1: tarifaBase = 1, diasAntelacion = 1, edad = 0
        try {
            double tarifaCalculada = Tarifa.calculoTarifa(1, 1, 0);
            assertEquals(1, tarifaCalculada, 0.01);
        } catch (ExcepcionParametrosInvalidos e) {
            fail("excepcion inesperada: " + e.getMessage());
        }

        // Caso 2: tarifaBase = -999, diasAntelacion = 365, edad = 150
        try {
            Tarifa.calculoTarifa(-999, 365, 150);
            fail("Se esperaba una excepcion 1");
        } catch (ExcepcionParametrosInvalidos e) {
            assertEquals("Los parametros no pueden ser negativos o nulos", e.getMessage());
        }

        // Caso 3: tarifaBase = 999, diasAntelacion = -365, edad = 0
        try {
            Tarifa.calculoTarifa(999, -365, 0);
            fail("Se esperaba una excepcion 2");
        } catch (ExcepcionParametrosInvalidos e) {
            assertEquals("Los parametros no pueden ser negativos o nulos", e.getMessage());
        }

        // Caso 4: tarifaBase = 999, diasAntelacion = 365, edad = 150
        try {
            Tarifa.calculoTarifa(999, 365, 150);
            fail("Se esperaba una excepcion 3");
        } catch (ExcepcionParametrosInvalidos e) {
            assertEquals("La edad no puede ser superior a 110", e.getMessage());
        }
    }
}
