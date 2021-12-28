
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;


public class SignupController {
    @FXML
    private AnchorPane signup;

    @FXML
    void SignupBtn(ActionEvent event) {

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

}
