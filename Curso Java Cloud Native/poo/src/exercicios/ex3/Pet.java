package exercicios.ex3;

public class Pet {
    private final String name;
    private boolean clean;

    public String getName() {
        return name;
    }

    public boolean getClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

    public Pet(String name) {
        this.name = name;
        this.clean = false;
    }
}
