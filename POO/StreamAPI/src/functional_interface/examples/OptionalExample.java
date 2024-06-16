package functional_interface.examples;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalExample
{
    public static void main(String[] args)
    {
        Optional<String> optionalValue = Optional.ofNullable(null);
        String result = optionalValue.orElse("Default");
        System.out.println(result);
    }
}
