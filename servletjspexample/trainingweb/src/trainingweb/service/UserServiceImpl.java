package trainingweb.service;

import trainingweb.entities.User;

public class UserServiceImpl implements UserService{
    @Override
    public boolean verifyUsernameAndPassword(String user,String password) {

        if(user.equals("Prabhat")){
            return true;

        }
        return false;
    }
}
