package streamApi;

import java.util.*;

public class Functions {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        
        // tem como parametro o numero passado e o resultado - no lambda do map ja tem uma new function
        List<Integer> numerosDobrados = numeros.stream().map(n -> n * 2).toList();

        System.out.println(numerosDobrados);
    }
}
