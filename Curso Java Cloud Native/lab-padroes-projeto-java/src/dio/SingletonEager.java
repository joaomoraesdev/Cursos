package dio;

/*
 * Singleton "apressado"
 */

public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager GetInstancia() {
        return instancia;
    }
}