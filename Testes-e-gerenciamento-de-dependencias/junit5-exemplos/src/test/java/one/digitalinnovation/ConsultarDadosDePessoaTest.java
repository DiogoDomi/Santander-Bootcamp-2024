package one.digitalinnovation;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class ConsultarDadosDePessoaTest
{
    @BeforeAll
    static void configurarConexao()
    {
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste()
    {
        BancoDeDados.insereDados(new Pessoa("Jõao", LocalDateTime.of(
                2000,
                1,
                1,
                13,
                0,
                0
        )));
    }

    @AfterEach
    void removeDadosDoTeste()
    {
        BancoDeDados.removeDados(new Pessoa("Jõao", LocalDateTime.of(
                2000,
                1,
                1,
                13,
                0,
                0
        )));
    }

    @Test
    void validarDadosDeRetorno()
    {
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosDeRetorno2()
    {
        Assertions.assertNull(null);
    }

    @AfterAll
    static void finalizarConexao()
    {
        BancoDeDados.finalizarConexao();
    }
}
