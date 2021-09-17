package service;

import dao.UserDAO;
import dao.UserDAOImpl;
import entities.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

class UserServiceTest {

    @Mock
    private UserDAO doaMock;

    @InjectMocks
    UserService userService;

    @BeforeEach
    public void init(){
        doaMock = Mockito.mock(UserDAO.class);
        userService = Mockito.mock(UserService.class);
    }
     @Test
    void testAddUser_returnsNewUser() {
        User user = new User();
        when(userService.addUser(any(User.class))).thenReturn(user);
        when(userService.getCurrentTime()).thenAnswer(I->new Date());
        /**
        System.out.println(userService.getCurrentTime());
        User userNew = new User();
        userNew.setEmail("abc@gmail.com");
        userNew.setName("Mani");
        System.out.println(userService.addUser(userNew));
        **/
        when(doaMock.addUser(any(User.class))).thenReturn(user);
        when(doaMock.getCurrentTime()).thenAnswer(I->new Date());

        //void method Using without doNothing
         Mockito.doNothing().when(doaMock).display();

         //void method  Without doNothing ---
         doaMock.display();
         Mockito.verify(doaMock, times(1)).display();
    }

    @Test
    void testAddUser_isUserAdded() {
        when(doaMock.isUserAdd()).thenReturn(true);
        UserDAO userDAO = new UserDAOImpl();
        boolean result = userDAO.isUserAdd();
        assertFalse(result);
        doaMock.isUserAdd();
        Mockito.verify(doaMock).isUserAdd();

    }
}