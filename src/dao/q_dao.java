
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    
    
    public void quiz (Questions question  ) {
        connection = DatabaseConnection.connect();
        sql = "SELECT * FROM java  " ;
        try {
            Statement st = connection.createStatement();
            resultSet = st.executeQuery(sql);
            //preparedStatement = connection.prepareStatement(sql);
            //String s ;
           // s = question.getId().toString();
            //preparedStatement.setString(1, Integer.toString(id));
            
            //resultSet = preparedStatement.executeQuery();
            //if(resultSet.next()){
            while (resultSet.next()) {
                System.out.println("");
                System.out.println(resultSet.getInt("id"));
                System.out.println( resultSet.getString("qustion") );
                System.out.println(resultSet.getString("ans1")) ;
                System.out.println(ans2 = resultSet.getString("ans2") );
                System.out.println (ans3 = resultSet.getString("ans3") );
            //}
            //System.out.println(q +"  " + ans1+"  "+ ans2 + "  " + ans3  );
            }
            //else
            System.out.println("errorrrrrrrrrrrrrr"  );    
        }
        catch (SQLException ex) {
            Logger.getLogger(q_dao.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        
       // return 0;
    } 
    
}
