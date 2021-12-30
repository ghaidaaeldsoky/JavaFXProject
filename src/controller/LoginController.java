
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javacontroller.userController;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import models.UserModel;


public class LoginController implements Initializable {

    @FXML
    private AnchorPane login;
    
    @FXML
    private Label warning;
    
    
    @FXML
    private PasswordField password;

    @FXML
    private TextField username;

    
    @FXML
    private Button loginBtn;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("First");

    }
    
    @FXML
    void LogInBtnAction(ActionEvent event) {
        //PauseTransition pt = new PauseTransition();
        //pt.setDuration(Duration.seconds(3));
        //pt.setOnFinished(ev -> {
        //    System.out.println("oKKKKKKKKKKKKKKK");
        //});
        //pt.play();
        loginBtn.setOnAction(e -> {
            userController uc = new userController();
            int result = uc.login(new UserModel(username.getText(), password.getText()));
            if (result == 1) {
                mainPage();
            } 
            else {
                warning.setText("Invalid UserName or Password !!!!");
                username.clear();
                password.clear();
            }
        }
        );
        
    }
    @FXML
    void signupBtnAction(ActionEvent event) throws IOException {
        
       /* PauseTransition pt = new PauseTransition();
        pt.setDuration(Duration.seconds(3));
        pt.setOnFinished(ev -> {
            System.out.println("sign up");
        });
        pt.play();
*/
        login.getScene().getWindow().hide();
        
        Parent root = FXMLLoader.load(getClass().getResource("/frontend/Signup.fxml"));
        Stage signup = new Stage();
        Scene scene = new Scene(root);
        signup.setScene(scene);
        signup.setResizable(false);
        signup.show();
    }
    
    public void mainPage() {
        login.getScene().getWindow().hide();
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("/frontend/Subjects.fxml"));
            Stage mainPage = new Stage();
            Scene scene = new Scene(root);
            mainPage.setScene(scene);
            mainPage.setResizable(false);
            mainPage.show();
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
