import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main
{
    public static void main(String[] args)
    {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição curso java");
        curso.setCargaHoraria(8);

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso js");
        curso1.setDescricao("Descrição curso js");
        curso1.setCargaHoraria(4);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudosBootcamp().add(curso);
        bootcamp.getConteudosBootcamp().add(curso1);
        bootcamp.getConteudosBootcamp().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progedir();
        devCamila.progedir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.cacularTotalXp());

        System.out.println("\n------------\n");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Joao: " + devJoao.getConteudosInscritos());
        devJoao.progedir();
        devJoao.progedir();
        devJoao.progedir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Joao: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Joao: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.cacularTotalXp());

    }
}
