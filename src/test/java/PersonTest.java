import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void addParents() {
        //arrange
        Person collin = new Person("Collin", "van", "Leeuwen", "Male", 29);
        Person monique = new Person("Monique", "Willems", "Female", 60);
        Person etienne = new Person("Etienne", "Stevens",  "Male", 52);



        //act
        collin.addParents(etienne, monique);

        //assert
        assertEquals("Etienne", collin.getFather().getName());
        assertEquals("Monique", collin.getMother().getName());
    }

    @Test
    public void testAddChild() {
        //arrange
        Person collin = new Person("Collin", "van", "Leeuwen", "Male", 29);
        Person monique = new Person("Monique", "Willems", "Female", 60);

        //act
        monique.addChild(collin);

        //assert
        assertEquals("Collin", monique.getChildren().get(0).getName());
    }

    @Test
    public void testAddPet() {
        //arrange
        Person collin = new Person("Collin", "van", "Leeuwen", "Male", 29);
        Pet hond = new Pet("Frank", 6, "Corgi");

        //act
        collin.addPet(hond);

        //assert
        assertEquals("Frank", collin.getPets().get(0).getName());
    }

    @Test
    public void addSibling() {
        //arrange
        Person collin = new Person("Collin", "van", "Leeuwen", "Male", 29);
        Person joelle = new Person("Joelle", "van", "Leeuwen", "Female", 35);

        //act
        collin.addSibling(joelle);

        //assert
        assertEquals("Joelle", collin.getSiblings().get(0).getName());
    }

    @Test
    public void getGrandchildren() {
        //arrange
        Person monique = new Person("Monique", "Willems", "Female", 60);
        Person collin = new Person("Collin", "van", "Leeuwen", "Male", 29);
        Person stevie = new Person("Stevie", "van", "Leeuwen", "Male", 3);
        monique.addChild(collin);
        collin.addChild(stevie);
        //act
        monique.getGrandchildren();
        //assert
    }
}