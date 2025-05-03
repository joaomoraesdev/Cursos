package lists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        List listaGenerica = new ArrayList<>();
        listaGenerica.add(10);
        listaGenerica.add("genérico");

        lista.add("Jão");
        lista.add("Julia");

        lista.forEach(nome -> System.out.println(nome));

        listaGenerica.forEach(item -> {
            String tipo = item.getClass().getSimpleName();
            if (tipo.equals("Integer"))
                System.out.println((Integer) item);
            if (tipo.equals("String"))
                System.out.println((String) item);

            // System.out.println(item.getClass().getSimpleName());
        });
    }
}
