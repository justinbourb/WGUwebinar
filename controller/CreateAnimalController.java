package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import model.Animal;
import model.DataProvider;
import model.Dog;

import javax.xml.crypto.Data;


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
    private Label specialLabel;

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
    private TextField specialTextField;

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
    private Button cancelButton;

    @FXML
    void onActionSaveAnimal(ActionEvent event) throws IOException {
        int id = Integer.parseInt(idTextField.getText());
        String breed =  breedTextField.getText();
        int lifespan = Integer.parseInt(lifespanTextField.getText());
        String behavior = behaviorTextField.getText();
        Double price = Double.parseDouble(priceTextField.getText());
        String special = specialTextField.getText();
        boolean vaccinated = (radioYes.isSelected());

        Dog dog = new Dog(id, breed, lifespan, behavior, price, vaccinated, special);
        DataProvider.addAnimal(dog);
        onActionDisplayMainMenu(event);
    }
    
     @FXML
    void onActionDisplayMainMenu(ActionEvent event) throws IOException {
         String resourceURL = "/view/MainMenu.fxml";
         switchStage.switchStage(event, resourceURL);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }


}
