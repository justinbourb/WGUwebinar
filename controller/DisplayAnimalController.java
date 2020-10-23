package controller;



import com.sun.scenario.animation.shared.ClipEnvelope;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.net.URL;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import model.Animal;
import model.DataProvider;

public class DisplayAnimalController implements Initializable {


    @FXML
    private AnchorPane anchorPane;

    @FXML
    private VBox vbox;

    @FXML
    private TableView<Animal> displayAnimalTable;

    @FXML
    private TableColumn<Animal, Integer> idColumn;

    @FXML
    private TableColumn<Animal, String> breedColumn;

    @FXML
    private TableColumn<Animal, Integer> lifespanColumn;

    @FXML
    private TableColumn<Animal, Double> priceColumn;

    @FXML
    private TableColumn<Animal, Boolean> vaccinatedColumn;

    @FXML
    private TableColumn<Animal, String> specialColumn;

    @FXML
    private HBox buttonHbox;

    @FXML
    private Button detailsButton;

    @FXML
    private Button backButton;

    @FXML
    void onActionDisplayAnimalDetailsMenu(ActionEvent event) throws IOException {
        String resourceURL = "/view/AnimalDetailMenu.fxml";
        switchStage.switchStage(event, resourceURL);
    }
    
     @FXML
    void onActionDisplayMainMenu(ActionEvent event) throws IOException {
         String resourceURL = "/view/MainMenu.fxml";
         switchStage.switchStage(event, resourceURL);
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //the get functions must be named correctly for new PropertyValueFactory<> to magically work
        displayAnimalTable.setItems(DataProvider.getAllAnimals());
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        breedColumn.setCellValueFactory(new PropertyValueFactory<>("breed"));
        lifespanColumn.setCellValueFactory(new PropertyValueFactory<>("lifespan"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        vaccinatedColumn.setCellValueFactory(new PropertyValueFactory<>("vaccinated"));
        specialColumn.setCellValueFactory(new PropertyValueFactory<>("special"));
    }

}
