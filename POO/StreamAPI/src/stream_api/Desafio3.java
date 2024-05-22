package stream_api;

import java.util.List;
import java.util.Arrays;

public class Desafio3
{
    public static void main(String[] args)
    {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                5, 4, 3);

        boolean resultado = numeros.stream()
                .allMatch(numero -> numero > 0);

        System.out.println("Todos os números da lista são positivos? " + resultado);
    }
}
