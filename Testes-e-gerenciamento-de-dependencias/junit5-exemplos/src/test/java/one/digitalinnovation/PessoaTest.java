package one.digitalinnovation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class PessoaTest
{
    @Test
    void deveCalcularIdadeCorretamente()
    {
        Pessoa jessica = new Pessoa("Jéssica", LocalDateTime.of(
                2000,
                1,
                1,
                15,
                0,
                0
        ));
        Assertions.assertEquals(24, jessica.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade()
    {
        Pessoa jessica = new Pessoa("Jéssica", LocalDateTime.of(
                2000,
                1,
                1,
                15,
                0,
                0
        ));
        Assertions.assertTrue(jessica.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("João", LocalDateTime.now());
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }
}
