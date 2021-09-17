package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class PersonTest {

    @Test
    public void testEmptyName(){
        //assert
        assertThrows(IllegalArgumentException.class, () -> new Person(null,null));

    }
}
