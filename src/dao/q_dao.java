
package dao;

import controller.SubjectsController;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Questions;

public class q_dao {
    private Connection connection = null;
    private String sql = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    private int result=0;
    public int id ;
    public String q;
    public String ans1;
    public String ans2;
    public String ans3;
    //public String correctans;
    int btn;
    
//    q_dao(int btnVal){
//        btn = btnVal;
//    }
    
    
    
    public ResultSet quiz1 (Questions question , int qid  ) {
        connection = DatabaseConnection.connect();
        sql= "SELECT question , ans1, ans2 ,ans3 , correctans FROM java WHERE id =?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, qid);
            resultSet = preparedStatement.executeQuery();
           if (resultSet.next()) {
               // System.out.println(resultSet.getString("question"));
                return resultSet;
            }
            
  
        } catch (SQLException ex) {
            Logger.getLogger(q_dao.class.getName()).log(Level.SEVERE, null, ex);
        } 
    return null;
}
}
