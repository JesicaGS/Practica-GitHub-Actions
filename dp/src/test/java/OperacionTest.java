import mate.Operacion; 
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OperacionTest {

    @Test
    public void testSumar() {
        Operacion op = new Operacion(13.5, 5); 
        double resultado = op.Sumar(13.5, 5);
        assertEquals(18.5, resultado, 0.001, "13.5 + 5 debe ser igual a 18.5");
    }

    @Test
    public void testRestar() {
        Operacion op = new Operacion(13.5, 5);
        double resultado = op.Restar(13.5, 5);
        assertEquals(8.5, resultado, 0.001, "13.5 - 5 debe ser igual a 8.5");
    }

    @Test
    public void testMultiplicar() {
        Operacion op = new Operacion(13.5, 5);
        double resultado = op.Multiplicar(13.5, 5);
        assertEquals(67.5, resultado, 0.001, "13.5 * 5 debe ser igual a 67.5");
    }

    @Test
    public void testDividir() {
        Operacion op = new Operacion(13.5, 5);
        double resultado = op.Dividir(13.5, 5);
        assertEquals(2.7, resultado, 0.001, "13.5 / 5 debe ser igual a 2.7");
    }
}