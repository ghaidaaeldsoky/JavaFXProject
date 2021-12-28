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
        return userDao.login(user);
    }
    
}
