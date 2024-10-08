/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package assignment04_221074002_task.pkg01;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 *
 * @author pavel ahamed
 */
public class UserSignupFXMLController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField fullnameTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private DatePicker birthdate;
    @FXML
    private RadioButton maleBtnR;
    @FXML
    private RadioButton femaleBtnR;
    @FXML
    private RadioButton otherBtnR;
    @FXML
    private Button signupBtn;
    
    private ToggleGroup genderGroup;
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // Group for the radio buttons
        genderGroup = new ToggleGroup();
        maleBtnR.setToggleGroup(genderGroup);
        femaleBtnR.setToggleGroup(genderGroup);
        otherBtnR.setToggleGroup(genderGroup);
    }
    
    @FXML
    private void handleSignup(ActionEvent event) throws IOException 
    {
        if (event.getSource() == signupBtn)
        {
            String fullname = fullnameTextField.getText();
            String email = emailTextField.getText();
            String birthDate = birthdate.getValue() != null ? birthdate.getValue().toString() : "Not selected";

            RadioButton selectedRadioButton = (RadioButton) genderGroup.getSelectedToggle();
            String gender = selectedRadioButton != null ? selectedRadioButton.getText() : "Not selected";

            // Load ProfileFXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("UserProfileFXML.fxml"));
            Parent root = loader.load();

            // ProfileController data pass
            UserProfileFXMLController profileController = loader.getController();
            profileController.setProfileData(fullname, email, birthDate,gender);


            // Profile window
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        }
        else
        {
            System.err.println("Signup failed. Please check your inputs.");
        }
    }

}
