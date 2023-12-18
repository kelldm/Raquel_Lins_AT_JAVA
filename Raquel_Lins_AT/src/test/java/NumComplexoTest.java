import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.NumComplexo;
import org.junit.jupiter.api.Test;

public class NumComplexoTest {
    @Test
    public void testSomar() {
        NumComplexo num1 = new NumComplexo(2, 3);
        NumComplexo num2 = new NumComplexo(1, 4);
        NumComplexo resultado = NumComplexo.somar(num1, num2);

        assertEquals(3, resultado.getReal(), 0.0001);
        assertEquals(7, resultado.getImaginario(), 0.0001);
    }

    @Test
    public void testSubtrair() {
        NumComplexo num1 = new NumComplexo(5, 8);
        NumComplexo num2 = new NumComplexo(2, 3);
        NumComplexo resultado = NumComplexo.subtrair(num1, num2);

        assertEquals(3, resultado.getReal(), 0.0001);
        assertEquals(5, resultado.getImaginario(), 0.0001);
    }

    @Test
    public void testModulo() {
        NumComplexo num = new NumComplexo(3, 4);
        double modulo = num.modulo();

        assertEquals(5, modulo, 0.0001);
    }
}


