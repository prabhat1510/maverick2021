package dao;

import entities.User;

import java.time.LocalDateTime;
import java.util.Date;

public interface UserDAO {
    public User addUser(User user);
    public Date getCurrentTime();

}
