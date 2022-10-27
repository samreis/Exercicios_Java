import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Samantha Alves Reis Ra: 202122146
 * Ciência da Computação - Profº Marcos Lopes
 */

class ContaSimplesTest {

    private ContaSimples contaSimples;

    @BeforeEach
    void setup() {
        this.contaSimples = new ContaSimples(555444, "Samantha", "02657059244");
    }

    //Verifique se o cpf é composto por um número de 11 dígitos
    @Test
    void test_verifica_numero_cpf_composto_por_11_digitos() {
        Assertions.assertEquals(true, this.contaSimples.validarCpf());
    }

    //Faça casos de teste que verifique o método depositar

    @Test
    void test_verifica_metodo_depositar_valor_maior_que_zero() {
        this.contaSimples.depositar(1.00);
        Assertions.assertEquals(1.0, this.contaSimples.getSaldo());
    }

    @Test
    void test_verifica_metodo_depositar_valor_menor_que_zero() {
        this.contaSimples.depositar(-1.00);
        Assertions.assertEquals(0.0, this.contaSimples.getSaldo());
    }

    //Faça casos de teste que verifique o método sacar.

    @Test
    void test_verifica_metodo_sacar_valor_maior_que_zero() {
        this.contaSimples.depositar(2.00);
        this.contaSimples.sacar(1.00);
        Assertions.assertEquals(1.00, this.contaSimples.getSaldo());
    }

    @Test
    void test_verifica_metodo_sacar_valor_menor_que_zero() {
        this.contaSimples.depositar(2.00);
        this.contaSimples.sacar(-1.00);
        Assertions.assertEquals(2.00, this.contaSimples.getSaldo());

    }

}
