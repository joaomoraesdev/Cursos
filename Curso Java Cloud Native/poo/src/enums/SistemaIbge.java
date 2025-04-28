package enums;

public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadosBr e : EstadosBr.values()) {
            System.out.println(e.getSigla() + " - " + e.getNome());
        }
        System.out.println(EstadosBr.SAO_PAULO.getNome());
    }
}
