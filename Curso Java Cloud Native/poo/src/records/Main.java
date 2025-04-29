package records;

public class Main {
    public static void main(String[] args) {
        var person = new Person("João");
        System.out.println(person);
        System.out.println(person.name());
        System.out.println(person.getInfo());
    }
}
