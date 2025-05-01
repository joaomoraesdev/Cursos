package instance;

public non-sealed class Manager extends Employee {
    @Override
    public String toString() {
        return "GERENTE - Nome: " + this.getName() + " | Salario: " + this.getSalary();
    }
}
