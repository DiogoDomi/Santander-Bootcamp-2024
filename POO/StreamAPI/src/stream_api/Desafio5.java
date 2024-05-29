package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio5
{
    public static void main(String[] args)
    {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> maioresQueCinco = numeros.stream()
                .filter(numero -> numero > 5)
                .toList();

        double resultado = maioresQueCinco
                .stream()
                .mapToInt(Integer::intValue)
                .sum();

        double media = resultado / maioresQueCinco.size();

        System.out.println("Media dos numeros maiores que cinco: " + media);


    }
}
//Done!!