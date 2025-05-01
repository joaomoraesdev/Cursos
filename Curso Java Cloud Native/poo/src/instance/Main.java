package instance;

public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager();
        Employee salesman = new Salesman();

        manager.setName("João");
        manager.setSalary(5000);

        salesman.setName("Matheus");
        salesman.setSalary(3000);

        System.out.println(manager.toString());
        System.out.println(salesman.toString());

        System.out.println(manager instanceof Employee);
        System.out.println(salesman instanceof Employee);
        System.out.println(salesman instanceof Manager);
    }
}