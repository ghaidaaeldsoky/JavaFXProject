
package controller;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javacontroller.userController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import models.Questions;


public class TestController implements Initializable {

    @FXML
    private AnchorPane question;
    
    @FXML
    private RadioButton a1;

    @FXML
    private RadioButton a2;

    @FXML
    private RadioButton a3;

    @FXML
    private ToggleGroup q1;

    @FXML
    private Label question1;
    
    @FXML
    void getAnswer(ActionEvent event) {

    }

    
    private static int clickNum =0;
    public static int result=0;
    private static int qNum =1;
    public String correctAns;

    @FXML
    void NextBtn(ActionEvent event) throws SQLException {
         ++clickNum;
        if (clickNum<5) {
            
           
           
            if (selectedAns() == null) {
                clickNum--;
            }
            else{ 
                String selected = selectedAns();
            
            checkAnswer(selected);
            
            System.out.println(selected);
            System.out.println(result);
            if (a1.isSelected()) {
                a1.setSelected(false);
            }
            else if (a2.isSelected()) a2.setSelected(false);
            else if (a3.isSelected()) a3.setSelected(false);
           
           
            qustion1(++qNum);}
            
           //testres.setText("result = "+result);
        }
        else {
             ResultPage();
            //resultpage();
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb)  {
        try {
            qustion1(1);
        } catch (SQLException ex) {
            Logger.getLogger(TestController.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }    
    
    public void qustion1(int x) throws SQLException {
       userController u = new userController(x);
            Questions q = new Questions ();
            u.Quiz(q,x);
            ResultSet res = u.Quiz(q,x);
            String qu = res.getString("question");
            String ans1 = res.getString("ans1");
            String ans2 = res.getString("ans2");
            String ans3 = res.getString("ans3");
            question1.setText(qu);
            a1.setText(ans1);
            a2.setText(ans2);
            a3.setText(ans3);
            
            correctAns = res.getString("correctans"); 
            
    }
    public void checkAnswer (String selectedAnswer) {
        if (selectedAnswer.equals(correctAns)) {
            //System.out.println("CORRECT1111");
            result+=10;
        }
        
    }
    
    public String selectedAns() {
        if (a1.isSelected()) {
            return a1.getText();
        }
        else if (a2.isSelected()) {
            return a2.getText();
        }
        else if (a3.isSelected()) {
            return a3.getText();
        }
        else {
            return null;
        }
    }
    
    public void ResultPage() {
        question.getScene().getWindow().hide();
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("/frontend/resultpage.fxml"));
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
