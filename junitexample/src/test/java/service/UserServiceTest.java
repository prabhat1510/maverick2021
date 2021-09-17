package service;

import dao.UserDAO;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @Mock
    private UserDAO doaMock;


    @InjectMocks
    UserService userService;
     @Test
    void testAddUser_returnsNewUser() {
         User user = new User();
         when()
    }
}