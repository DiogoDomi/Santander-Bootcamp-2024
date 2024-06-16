package me.dio.mockito.exemplos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class EnviarMensagensTeste
{
    @Spy
    private EnviarMensagem enviarMensagem;

    @Test
    void verificarComportamentDaClasse()
    {
        Mockito.verifyNoInteractions(enviarMensagem);

        Mensagem mensagem = new Mensagem("Hello World");
        enviarMensagem.adicionarMensagens(mensagem);

        Mockito.verify(enviarMensagem).adicionarMensagens(mensagem);

        Assertions.assertFalse(enviarMensagem.getMensagens().isEmpty());

        
    }

}
