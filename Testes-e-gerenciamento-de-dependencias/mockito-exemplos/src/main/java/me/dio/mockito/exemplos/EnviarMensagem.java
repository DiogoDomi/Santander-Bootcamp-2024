package me.dio.mockito.exemplos;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class EnviarMensagem
{
    private List<Mensagem> mensagens = new ArrayList<>();

    public void adicionarMensagens(Mensagem mensagem) {this.mensagens.add(mensagem);}

    public List<Mensagem> getMensagens() {return Collections.unmodifiableList(this.mensagens);}

}
