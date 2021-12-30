
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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import models.UserModel;


public class SignupController {
    @FXML
    private AnchorPane signup;

    @FXML
    private TextField email;

    @FXML
    private TextField id;

    @FXML
    private TextField name;

    @FXML
    private PasswordField password;
    
    @FXML
    private Button signbtn;

    @FXML
    private TextField username;

    @FXML
    private Text warning;
    
    @FXML
    void SignupBtn(ActionEvent event) {
       
        signbtn.setOnAction(ev -> {
        UserModel user = new UserModel();
        user.setUsername(username.getText());
        user.setPassword(password.getText());
        user.setName(name.getText());
        user.setEmail(email.getText());
        userController uc = new userController();
            int result = uc.register(user);
            if(result == 1){
                mainPage();
            }else if (result == 2) {
             warning.setText("Please Enter The missing info");
            } else if (result == 3) {
            warning.setText("usernme must be more than 5 digts");
            } else if (result == 4) {
            warning.setText("password must be more than 7 digts");
           }
            else {
               
                warning.setText("username aleardy exist Login now");
        }
                PauseTransition pt1 = new PauseTransition();
                pt1.setDuration(Duration.seconds(3));
                pt1.setOnFinished(e -> {
                    warning.setText("");
                });   
                pt1.play();
            
        });
   
    }

    @FXML
    void loginBtn(ActionEvent event) throws IOException {
        signup.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/frontend/Login.fxml"));
        Stage login = new Stage();
        Scene scene = new Scene(root);
        login.setScene(scene);
        login.setResizable(false);
        login.show();
    }
    
     public void mainPage() {
        signup.getScene().getWindow().hide();
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
