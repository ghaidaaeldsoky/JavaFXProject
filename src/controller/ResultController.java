
package controller;

import static controller.TestController.result;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ResultController implements Initializable {
    @FXML
    private Label expression;

    @FXML
    private Label resLabel;
    
    @FXML
    private AnchorPane resultpage;

    TestController c=new TestController();
    @FXML
    void mainPageBtn(ActionEvent event) {
        c.resetValues();
        mainPage();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        int res = result;
        String r;
        r=Integer.toString(res);
        resLabel.setText(r);
        
        if (res == 0) {
            expression.setText("Try harder next Time");
        }
        else if ( res == 50) {
            expression.setText("Excellent !!");
        }
        else {
            expression.setText("Good Job");
        }
    }
    
    public void mainPage() {
        resultpage.getScene().getWindow().hide();
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("/frontend/Subjects.fxml"));
            Stage mainPage = new Stage();
            Scene scene = new Scene(root);
            mainPage.setScene(scene);
            mainPage.setResizable(false);
            mainPage.show();
        } catch (IOException ex) {
            Logger.getLogger(SubjectsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
