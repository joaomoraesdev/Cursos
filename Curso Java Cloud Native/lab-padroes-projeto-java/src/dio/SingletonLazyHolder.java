package dio;

/*
 * Singleton "Lazy Holder"
 */

public class SingletonLazyHolder {
    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder GetInstancia() {
        return InstanceHolder.instancia;
    }
}