import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Samantha Alves Reis - RA: 202122146
 * Ciência da Computação - Profº Marcos Lopes
 */
class DeltaTest {

    @Test
    void teste_numero_raizes_retorna_zero_quando_resultado_do_delta_eh_menor_que_zero() {
        Delta delta = new Delta(-2.00, -8.00, -24.00);
        Assertions.assertEquals(0, delta.numeroDeRaizes(delta));
    }

    @Test
    void teste_numero_raizes_retorna_um_quando_resultado_do_delta_eh_igual_a_zero() {
        Delta delta = new Delta(0.00, 0.00, 0.00);
        Assertions.assertEquals(1, delta.numeroDeRaizes(delta));
    }

    @Test
    void teste_numero_raizes_retorna_dois_quando_resultado_do_delta_eh_maior_que_zero() {
        Delta delta = new Delta(2.00, 8.00, -24.00);
        Assertions.assertEquals(2, delta.numeroDeRaizes(delta));
    }

}
