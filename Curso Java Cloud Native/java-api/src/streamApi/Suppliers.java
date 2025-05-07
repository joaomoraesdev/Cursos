package streamApi;

import java.util.*;
import java.util.stream.Stream;

// O Supplir não aceita argumentos, porém retorna um tipo de resultado
public class Suppliers {
    public static void main(String[] args) {
        List<String> lista = Stream.generate(() -> "Hello, World!").limit(5).toList();
        lista.forEach(s -> System.out.println(s));
    }
}
