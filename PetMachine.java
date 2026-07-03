import java.sql.SQLOutput;

public class PetMachine {

    private boolean clean;

    private int water;

    private int shampoo;

    private Pet pet;

    public void takeAShower(){

        if (this.pet == null){
            System.out.println("Coloque o pet na máquina para iniciar o banho");
            return;
        }

        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + "Está Limpo");
    }

    public void addWater(){
        if (water == 30){
            System.out.println("A capacidade de água da máquina está no máximo");
            return;
        }
        water += 2;
    }

    public void addShampoo(){
        if (shampoo == 10){
            System.out.println("A capacidade de shampoo da máquina está no máximo");
            return;
        }
        shampoo += 2;
    }

    public int getShampoo() {
        return shampoo;
    }

    public int getWater() {
        return water;
    }

    public boolean hasPet(){
        return pet != null;

    }

    public void setPet(Pet pet) {
        if (this.pet != null){
            System.out.println();
        }
        this.pet = pet;
    }
}
