package controller;



import com.sun.scenario.animation.shared.ClipEnvelope;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URL;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
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
    private HBox topHBox;

    @FXML
    private TextField searchTextField;

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
    @FXML
    void onKeyReleasedSearchText(javafx.scene.input.KeyEvent keyEvent) {
        //TODO: search() is working correctly, need to then filter results on screen.
        //This should be covered in a future webinar
        System.out.println(searchTextField.getText() + " entered into search");
        System.out.println("Search results: " + search(searchTextField.getText()));
    }

    public boolean search(String searchInput) {
        boolean itsInt;
        int intSearch = -1;
        String stringSearch = null;
        //check if the search input is an int or a string
        try {
            intSearch = Integer.parseInt(searchInput, 10);
            itsInt = true;
        } catch (Exception e){
            stringSearch = searchInput;
            itsInt = false;
        }
        //if int, search against ID else search against Breed
        for (Animal dog : DataProvider.getAllAnimals()){
            if (itsInt){
                if(dog.getId() == intSearch){
                    return true;
                }
            } else {
                if(dog.getBreed().contains(stringSearch)){
                    return true;
                }
            }
        }
        //no match, return false
        return false;
    }
}
