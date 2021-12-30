
package onlineexam;

import dao.DatabaseConnection;
import dao.q_dao;
import dao.user_dao;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javacontroller.userController;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import models.Questions;
import models.UserModel;


public class OnlineExam extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception{
       
        Parent root = FXMLLoader.load(getClass().getResource("/frontend/Login.fxml"));
        Scene scene = new Scene(root,600,359);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Login");
        primaryStage.show();
        
    }


    public static void main(String[] args) {
        //DatabaseConnection.connect();
//        UserModel user =new UserModel();
//        user.setUsername("Aya_m");
//        user.setPassword("0000");
//        user.setName("Aya Mahmoud");
//        user.setEmail("aya@gmail");


//        
//         //userController u= new userController();
//         user_dao dao = new user_dao();
//         System.out.println(dao.signup(user));
       // launch(args);
        q_dao test = new q_dao();
        Questions question = new Questions();
        test.quiz(question);
        //System.out.println("java version: "+System.getProperty("java.version"));
        //System.out.println("javafx.version: " + System.getProperty("javafx.version"));
    }
    
}
