/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services_implementation;

import Services.UserServices;
import dao.user_dao;
import models.UserModel;


public class UserServiceImpl implements UserServices {

    private user_dao userDao;

    public UserServiceImpl() {
        userDao = new user_dao();
    }
    
    @Override
    public int login(UserModel user) {
        if (user.getUsername().trim().isEmpty() || user.getPassword().trim().isEmpty()) {
            return 0;
        }
        return userDao.login(user);
    }
     @Override
    public int signUp(UserModel user) {
        if (user.getUsername().trim().isEmpty() || user.getPassword().trim().isEmpty()
                || user.getName().trim().isEmpty() || user.getEmail().trim().isEmpty()) {
            return 2;
        }
        if(user.getUsername().length() < 5){
            return 3;
        }
        if(user.getPassword().length() < 7){
            return 4;
        }
        
        
        return userDao.signup(user);
    }
    
}
