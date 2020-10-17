package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class mainMenuController implements Initializable {
    
    @FXML
    private AnchorPane anchorPane;

    @FXML
    private VBox vbox;

    @FXML
    private Button createButton = new Button();

    @FXML
    private Button displayButton = new Button();

    @FXML
    private Button exitButton = new Button();
    
    @FXML
    void onActionCreateAnimal(ActionEvent event) {
        String value = ((Button)event.getSource()).getText();
        System.out.println(value + " button clicked!");
    }
    
     @FXML
    void onActionDisplayAnimals(ActionEvent event) {
        String value = ((Button)event.getSource()).getText();
        System.out.println(value + " button clicked!");
    }

     @FXML
    void onActionExit(ActionEvent event) {
        String value = ((Button)event.getSource()).getText();
        System.out.println(value + " button clicked!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("initialized");
    }



}
