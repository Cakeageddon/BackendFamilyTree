import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void addChild() {
        //arrange
        Person parent = new Person("Collin", "van", "Leeuwen", "Man", 29);
        Person child = new Person("Junior", "van", "Leeuwen", "Man", 18);
        List<Person> children = new ArrayList<>();
        children.add(child);
        //act
        parent.addChild(parent, child);
        List<Person> kids = parent.getChildren();
        //assert
        assertEquals(children, kids);
        assertEquals("Junior", parent.getChildren().get(0).getName());
        assertEquals("van", parent.getChildren().get(0).getMiddleName());
    }

    @Test
    public void addPet() {
        //arrange
        Person owner = new Person("Stevie", "Wonder", "Male", 45);
        Pet cat = new Pet("Willie", 4, "Langharige boskat");
        List<Pet> pets = new ArrayList<>();
        pets.add(cat);
        //act
        owner.addPet(owner, cat);
        List<Pet> homePet = owner.getPets();
        //assert
        assertEquals(pets, homePet);
        assertEquals("Willie", owner.getPets().get(0).getName());
    }
}