package records;

public record Person(String name, int age) {
    // É como se fosse um construtor já
    // Para acessar os parâmetros, faz-se as chamadas como Getters
    // Não da para alterar os valores do parâmtro, pois eles são final
    // Serve para trabalhar com objetos imutáveis
    // Permite apenas propriedades estáticas

    public Person {
        System.out.println("Construtor Manual no Record - RODA ANTES");
    }

    public Person (String name) {
        this(name, 1);
    }

    public String getInfo() {
        return "Name: " + name + " Age: " + age;
    }
}
