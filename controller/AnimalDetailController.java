package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;



public class AnimalDetailController implements Initializable {
    
//TODO: add buttons,fields, etc from SceneBuilder
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
    void onActionDisplayMainMenu(ActionEvent event) {
        
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }


}
