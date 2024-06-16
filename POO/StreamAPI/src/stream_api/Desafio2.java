package stream_api;

import java.util.List;
import java.util.Arrays;

public class Desafio2
{
    public static void main(String[] args)
    {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int resultado = numeros.stream()
                .filter(numero -> (numero % 2 == 0))
                .reduce(0,Integer::sum);

        System.out.println("A soma dos números pares é: " + resultado);

    }
}
//DONE!!