/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package assignment04_221074002_task.pkg01;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author pavel ahamed
 */
public class UserProfileFXMLController implements Initializable {

    @FXML
    private Label fullnameLabel;
    @FXML
    private Label emailLabel;
    @FXML
    private Label birthdateLabel;
    @FXML
    private Label genderLabel;

    public void setProfileData(String fullname, String email, String birthDate, String gender)
    {
        fullnameLabel.setText(fullname);
        emailLabel.setText(email);
        birthdateLabel.setText(birthDate);
        genderLabel.setText(gender);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
