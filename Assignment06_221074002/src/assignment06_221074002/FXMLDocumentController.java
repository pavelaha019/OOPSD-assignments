/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package assignment06_221074002;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private ComboBox<String> combobox;
    ObservableList<String> list = FXCollections.observableArrayList("Pavel","Tasif");
    @FXML
    private TextField tfadd;
    @FXML
    private Button btnadd;
    @FXML
    private ListView<String> listview;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       combobox.setItems(list);
       listview.setItems(list);
    }    

    @FXML
    private void comboboxAction(ActionEvent event) {
   label.setText(combobox.getValue());
   
        
    }

    @FXML
    private void AddToCombobox(ActionEvent event) {
    combobox.getItems().add(tfadd.getText());
        System.out.println("added"+tfadd.getText());
    
    }
    
}
