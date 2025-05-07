package streamApi;

import java.util.Arrays;
import java.util.List;

public class Predicates {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "python", "c#", "kotlin");
        palavras.stream().filter(n -> n.length() < 5).forEach(System.out::println);
    }
}
