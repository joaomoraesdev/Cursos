package instance;

public non-sealed class Salesman extends Employee {
    @Override
    public String toString() {
        return "VENDEDOR - Nome: " + this.getName() + " | Salario: " + this.getSalary();
    }
}
