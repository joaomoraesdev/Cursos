package exercicios.ex3;

public class PetMachine {
    private boolean clean = true;
    private int water = 30;
    private int shampoo = 10;
    private Pet pet;

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }
    
    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        if(!this.clean) {
            System.out.println("A máquina está suja, para colocar o pet é necessário limpa-lá");
            return;
        }

        if(hasPet()) {
            System.out.println("O pet " + this.pet.getName() + " está na máquina nesse momento");
            return;
        }

        this.pet = pet;
    }

    public void takeAShower() {
        if (this.pet == null) {
            System.out.println("Coloque o pet na máquina para iniciar o banho");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " está limpo");
    }

    public void addWater() {
        if (water == 30) {
            System.out.println("A capacidade de água da máquina está no máximo");
            return;
        }

        water += 2;
    }

    public void addShampoo() {
        if (shampoo == 10) {
            System.out.println("A capacidade de shampoo da máquina está no máximo");
            return;
        }

        shampoo += 2;
    }

    public boolean hasPet() {
        return pet != null;
    }


    public void removePet() {
        this.clean = this.pet.getClean();
        System.out.println("O pet " + this.pet.getName() + " está limpo");
        this.pet = null;
    }

    public void wash() {
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A máquina está limpa");
    }
}
