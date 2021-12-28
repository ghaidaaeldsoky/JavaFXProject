
package javacontroller;

import Services_implementation.UserServiceImpl;
import models.UserModel;

public class userController {
    
    private UserServiceImpl userServiceImpl;

    public userController() {
        
        userServiceImpl = new UserServiceImpl();
    }
    
    
    public int login(UserModel user){
        return userServiceImpl.login(user);
    }
}
