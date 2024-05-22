package functional_interface.examples;

import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

public class SupplierExample
{
    public static void main(String[] args)
    {
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

        List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem-vindo(a)!")
                .limit(3)
                .toList();

        listaSaudacoes.forEach(System.out::println);
    }
}
