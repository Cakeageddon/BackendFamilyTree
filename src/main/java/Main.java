import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Person collin = new Person("Collin", "van", "Leeuwen", "Male", 29);
        Person monique = new Person("Monique", "Willems", "Female", 60);
        Person etienne = new Person("Etienne", "Stevens",  "Male", 52);
        Person stevie = new Person("Stevie", "van", "Leeuwen", "Male", 3);
        Person stevie2 = new Person("Stevie2", "van", "Leeuwen", "Male", 3);
        Pet hond = new Pet("Frank", 6, "Corgi");

        collin.addPet(hond);
        collin.addChild(stevie2);
        collin.addParents(etienne, monique);
        collin.addChild(stevie);
        etienne.addChild(collin);

        hond.setOwner(collin);

        hond.getOwner().getName();
        etienne.getGrandchildren();

    }


}
