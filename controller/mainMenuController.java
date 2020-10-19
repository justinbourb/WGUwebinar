package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class mainMenuController implements Initializable {
    
    @FXML
    private AnchorPane anchorPane;

    @FXML
    private VBox vbox;

    @FXML
    private Label animalModelLabel;

    @FXML
    private Button createButton = new Button();

    @FXML
    private Button displayButton = new Button();

    @FXML
    private Button exitButton = new Button();

    @FXML
    private URL location;



    @FXML
    void onActionCreateAnimal(ActionEvent event) throws IOException {
        String resourceURL = "/view/CreateAnimalMenu.fxml";
        switchStage.switchStage(event, resourceURL);
    }
    
     @FXML
    void onActionDisplayAnimals(ActionEvent event) throws IOException {
         String resourceURL = "/view/DisplayAnimalMenu.fxml";
         switchStage.switchStage(event, resourceURL);
    }

     @FXML
    void onActionExit(ActionEvent event) {
        System.exit(0);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }




}
