package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import model.DataProvider;
import model.Dog;


public class AnimalDetailController implements Initializable {

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
    private Label idDetailsLabel;

    @FXML
    private Label breedDetailsLabel;

    @FXML
    private Label lifespanDetailsLabel;

    @FXML
    private Label behaviorDetailsLabel;

    @FXML
    private Label priceDetailsLabel;

    @FXML
    private Label vaccinatedDetailsLabel;

    @FXML
    private Label specialDetailsLabel;

    @FXML
    private HBox buttonHbox;

    @FXML
    private Button exitButton;

    @FXML
    void onActionDisplayAnimalMenu(ActionEvent event) throws IOException {
        String resourceURL = "/view/DisplayAnimalMenu.fxml";
        switchStage.switchStage(event, resourceURL);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        idDetailsLabel.setText(String.valueOf(DataProvider.getAllAnimals().get(DataProvider.selectedIndex).getId()));
        breedDetailsLabel.setText(String.valueOf(DataProvider.getAllAnimals().get(DataProvider.selectedIndex).getBreed()));;
        lifespanDetailsLabel.setText(String.valueOf(DataProvider.getAllAnimals().get(DataProvider.selectedIndex).getLifespan()));;
        behaviorDetailsLabel.setText(String.valueOf(DataProvider.getAllAnimals().get(DataProvider.selectedIndex).getBehavior()));;
        priceDetailsLabel.setText(String.valueOf(DataProvider.getAllAnimals().get(DataProvider.selectedIndex).getPrice()));;
        vaccinatedDetailsLabel.setText(String.valueOf(DataProvider.getAllAnimals().get(DataProvider.selectedIndex).getVaccinated()));;
        //((Dog)DataProvider.getAllAnimals().get(DataProvider.selectedIndex)) casts the Animal object as a Dog object to allow access to .getSpecial()
        specialDetailsLabel.setText(((Dog)DataProvider.getAllAnimals().get(DataProvider.selectedIndex)).getSpecial());
    }
}
