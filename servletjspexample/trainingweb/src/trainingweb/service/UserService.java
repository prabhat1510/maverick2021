package trainingweb.service;

import trainingweb.entities.User;

public interface UserService {

    public boolean verifyUsernameAndPassword(String user,String password);

}
