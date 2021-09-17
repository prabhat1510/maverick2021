package service;

import entities.User;

import java.time.LocalDateTime;
import java.util.Date;

public interface UserService {

    public User addUser(User user);
    public Date getCurrentTime();
}
