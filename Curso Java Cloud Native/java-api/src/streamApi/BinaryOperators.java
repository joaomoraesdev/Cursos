package streamApi;

import java.util.*;

public class BinaryOperators {
    public static void main(String[] args) {
        List<Integer> n = Arrays.asList(1, 2, 3, 4, 5);

        // o BinaryOperator receber dois parametros do mesmo tipo e retorna o mesmo tipo
        System.out.println(n.stream().reduce(0, Integer::sum));
    }
}
