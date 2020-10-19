package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;





public class CreateAnimalController implements Initializable {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private VBox vbox;

    @FXML
    private Label idLabel;

    @FXML
    private Label breedLabel;

    @FXML
    private Label lifespanLabel;

    @FXML
    private Label behaviorLabel;

    @FXML
    private Label priceLabel;

    @FXML
    private Label vaccinatedLabel;

    @FXML
    private TextField idTextField;

    @FXML
    private TextField breedTextField;

    @FXML
    private TextField lifespanTextField;

    @FXML
    private TextField behaviorTextField;

    @FXML
    private TextField priceTextField;

    @FXML
    private HBox booleanHbox;

    @FXML
    private RadioButton radioYes;

    @FXML
    private ToggleGroup vaccinatedToggle;

    @FXML
    private RadioButton radioNo;

    @FXML
    private HBox buttonHbox;

    @FXML
    private Button saveButton;

    @FXML
    private Button exitButton;

    @FXML
    void onActionSaveAnimal(ActionEvent event) {
        
    }
    
     @FXML
    void onActionDisplayMainMenu(ActionEvent event) {
        
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("initialized");
    }


}
