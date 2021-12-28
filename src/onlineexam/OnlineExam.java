
package onlineexam;

import dao.DatabaseConnection;
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
        /*UserModel user =new UserModel();
        user.setUsername("Ahmed_1");
        user.setPassword("123");
         userController u= new userController();
         int val=u.login(user);
         System.out.println(val);*/
        launch(args);
        //System.out.println("java version: "+System.getProperty("java.version"));
        //System.out.println("javafx.version: " + System.getProperty("javafx.version"));
    }
    
}
