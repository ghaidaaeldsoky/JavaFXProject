/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;


public class TestController implements Initializable {

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
if (q1.getSelectedToggle().equals(a1)) {
            
            question1.setText("1");
            System.out.println("1111111111111");
        }
        else if (a2.isSelected()) {
            System.out.println("1111111111111");

            question1.setText("2");
        }
        else if (a3.isSelected()) {
            System.out.println("1111111111111");

            question1.setText("3");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
