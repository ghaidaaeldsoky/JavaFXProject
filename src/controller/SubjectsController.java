/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class SubjectsController implements Initializable {
    
     @FXML
    private Button subject1;

    @FXML
    private Button subject2;

    @FXML
    private Button subject4;

    @FXML
    private AnchorPane subjects;

    @FXML
    private Button sybject3;

    @FXML
    private Button sybject5;

    @FXML
    void sub1Action(ActionEvent event) {
        quizPage();
    }

    @FXML
    void sub2Action(ActionEvent event) {
        quizPage();
    }

    @FXML
    void sub3Action(ActionEvent event) {

    }

    @FXML
    void sub4Action(ActionEvent event) {

    }

    @FXML
    void sub5Action(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    public void quizPage() {
        subjects.getScene().getWindow().hide();
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("/frontend/Quiz.fxml"));
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
