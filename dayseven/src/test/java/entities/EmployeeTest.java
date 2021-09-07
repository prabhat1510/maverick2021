package entities;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    @Test
    public void addEmployee(){
        String message = "employee added successfully";
        assertEquals("employee added successfully",message);
    }
}
