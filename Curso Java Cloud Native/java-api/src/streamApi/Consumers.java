package streamApi;

import java.util.*;

// O Consumer aceita argumentos, porém não retorna nenhum tipo de resultado - void
public class Consumers {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}
