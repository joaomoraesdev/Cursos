package instance;

// Sela a classe para que apenas classes filho X, Y e Z possam herdar dela
// Abstrai ela para que não instanciam a mesma
public sealed abstract class Employee permits Manager, Salesman {
    private String name;
    private double salary;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
