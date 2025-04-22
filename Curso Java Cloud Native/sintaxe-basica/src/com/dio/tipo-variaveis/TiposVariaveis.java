public class TiposVariaveis {
    public static void main(String[] args) {
        double salarioMinimo = 2500.33;
        float x = 2.33F;  // precisa do F no final para não ser reconhecido como DOUBLE
        long cpf = 1234L; // precisa do L no final para não ser reconhecido como INT
        String salario = String.valueOf(salarioMinimo);
        final String AUTOR = "João";
        System.out.println(AUTOR);
    }
}