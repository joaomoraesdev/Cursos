package dio;

public class Teste {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.GetInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.GetInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.GetInstancia();
        System.out.println(eager);
        eager = SingletonEager.GetInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyH = SingletonLazyHolder.GetInstancia();
        System.out.println(lazyH);
        lazyH = SingletonLazyHolder.GetInstancia();
        System.out.println(lazyH);
    }
}
