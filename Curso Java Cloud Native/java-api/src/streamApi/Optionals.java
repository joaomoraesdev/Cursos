package streamApi;

import java.util.Optional;

public class Optionals {
    public static void main(String[] args) throws Exception {
        Optional<String> optionalValue = Optional.ofNullable(null);
        optionalValue.orElse("Default");
        optionalValue.orElseThrow(() -> new Exception("falhou"));
        System.out.println(optionalValue.get());
    }
}
