/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.UserModel;


public class user_dao {
    
    private Connection connection = null;
    private String sql = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    private int result=0;
    public user_dao() {
        
    }
    
    public int login (UserModel user) {
        connection = DatabaseConnection.connect();
        sql = "SELECT username,password FROM user_data WHERE username = ? and password = ?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(user_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }
    
    public int signup(UserModel user){
        connection = DatabaseConnection.connect();
        sql= "INSERT INTO user_data (username, password, name, email) values (?, ?, ?, ?)";
        try {
            preparedStatement = connection.prepareStatement(sql);
           preparedStatement.setString(1, user.getUsername());
           preparedStatement.setString(2, user.getPassword());
           preparedStatement.setString(3, user.getName());
           preparedStatement.setString(4, user.getEmail());
           result = preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(user_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
