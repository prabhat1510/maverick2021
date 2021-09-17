package service;

import dao.UserDAO;
import entities.User;

import java.time.LocalDateTime;
import java.util.Date;

public class UserServiceImpl implements UserService {
    //@Autowired
    UserDAO userDAO;

    @Override
    public User addUser(User user) {
        User addedUser = userDAO.addUser(user);
        return addedUser;
    }

    @Override
    public Date getCurrentTime() {
        return null;
    }
}
