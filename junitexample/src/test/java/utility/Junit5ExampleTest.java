package utility;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Junit 5 example class")
public class Junit5ExampleTest {
    /**
     * Setup and teardown methods.
     * In class you can have four setup and teardown methods that must fulfill below conditions:-
     * 1. These methods must not return anything. return type of these methods must be void
     * 2. Setup and teardown methods cannot be private
     *
     * setuP and teardown methods are described as following:
     * 1. The method that is annotated with the @BeforeAll annotation
     *    must be static and it runs once before any test method is run.
     *
     * 2. The method that is annotated with the @BeforeEach annotation is invoked before each test method
     * 3. The method that is annotated with the @AfterEach annotation is invoked after each test method
     * 4. The method that is annotated with the @AfterAll annotation must be static,and it runs once after
     *    any test method have been run.
     *
     */
/**
    @BeforeAll
    public static void beforAll(){
            System.out.println("before all test methods is executed");

    }
    @AfterAll
    public static void afterAll(){
        System.out.println("after all test methods is executed");

    }

    @BeforeEach
    public void beforEach(){
        System.out.println("before each test methods is executed");

    }
    @AfterEach
    public  void afterEach(){
        System.out.println("after each test methods is executed");

    }
 **/
    @Test
    @DisplayName("First test method")
    public void testFirstMethod(){
            System.out.println("First test method ");
    }
    @Test
    @DisplayName("Second test method")
    public void testSecondMethod(){
        System.out.println("Second test method ");
    }

    @Test
    public void test_firstMethodForNullValues(){
        //assertNull(null);
        Junit5Example junit5Example = new Junit5Example();
        //assertNull(junit5Example.firstMethod(),"null value");
        assertNotEquals(null,junit5Example.firstMethod(),"Not Null value is returnedd");
        assertNotNull(junit5Example.firstMethod(),"Message is returned");
    }
    @Test
    public void test_firstMethodForNotNullValues(){
        //assertNull(null);
        Junit5Example junit5Example = new Junit5Example();
        assertEquals("Hello",junit5Example.firstMethod(),"Message is returned");
    }

    @Test
    public void test_SecondMethod(){
        //assertNull(null);
        Junit5Example junit5Example = new Junit5Example();
        /*assertEquals(,,"tested second method");
        assertNull();
        assertThrows();
        assertTrue();
        assertNotEquals();
        assertNotSame();*/
        //assertEquals(,junit5Example.secondMethod(),"Nothing to be displayed");
        junit5Example.secondMethod("Hello");
        assertEquals(1,junit5Example.list.size(),"list is update");
        assertNotEquals(0,junit5Example.list.size(),"list is update");
        //assertEquals(0,junit5Example.list.size(),"list is update");

    }

}
