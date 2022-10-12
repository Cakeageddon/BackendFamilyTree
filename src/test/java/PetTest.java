import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class PetTest {

    @Test
    public void setOwner() {
        //arrange
        Person collin = new Person("Collin", "van", "Leeuwen", "Male", 29);
        Pet hond = new Pet("Frank", 6, "Corgi");

        //act
        hond.setOwner(collin);

        //assert
        Assertions.assertEquals("Collin", hond.getOwner().getName());
    }
}