package controller;



import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.net.URL;
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
        displayAnimalTable.getSelectionModel().select(0);
        //selects the row provided in the tableView
        //displayAnimalTable.getSelectionModel().select(selectAnimal(5));
    }


    //onAction and onKeyReleased
    @FXML
    void onActionDisplayAnimalDetailsMenu(ActionEvent event) throws IOException {
        DataProvider.selectedIndex = displayAnimalTable.getSelectionModel().getFocusedIndex();
        String resourceURL = "/view/AnimalDetailMenu.fxml";
        switchStage.switchStage(event, resourceURL);
    }
    
     @FXML
    void onActionDisplayMainMenu(ActionEvent event) throws IOException {
         String resourceURL = "/view/MainMenu.fxml";
         switchStage.switchStage(event, resourceURL);
    }
    @FXML
    void onKeyReleasedSearchText(javafx.scene.input.KeyEvent keyEvent) throws IOException {
        search(searchTextField.getText());
        displayAnimalTable.setItems(DataProvider.getFilteredAnimals());
    }

    //other functions

    public boolean delete (int id){
        /*
        Purpose: removes the specified animal from getAllAnimals by id provided
        Input: id and animal
        Return: boolean true if animal is removed / false otherwise
        Notes: very similar to search method, not DRY
         */

        for (Animal dog : DataProvider.getAllAnimals()) {
            if (dog.getId() == id) {
                //returns true if removed
                return DataProvider.getAllAnimals().remove(dog);
            }
        }
        return false;
    }


    public void search(String searchInput) throws IOException {
        /*
        Purpose: search DataProvider.getAllAnimals() by ID or Breed
            checks if the input can be converted to an int, if so searches by ID
            else searches by Breed (assumed input is a string if not an int)
        Input: searchInput, the string typed into the search field
        Return: true if a match is found or false if not
         */
        boolean itsInt;
        int intSearch = -1;
        String stringSearch = null;
        //check if filtered list contains data
        if (!(DataProvider.getFilteredAnimals().isEmpty())){
            DataProvider.getFilteredAnimals().clear();
        }
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
                    DataProvider.getFilteredAnimals().add(dog);
                }
            } else {
                if(dog.getBreed().contains(stringSearch)){
                    DataProvider.getFilteredAnimals().add(dog);
                }
            }
        }


    }

    public Animal selectAnimal(int id){
        /*
        Purpose: returns the specified animal from getAllAnimals by id provided
        Input: id
        Return: the animal object found
        Notes: very similar to search method, not DRY
         */

        for (Animal dog : DataProvider.getAllAnimals()) {
            if (dog.getId() == id) {
                return dog;
            }
        }
        return null;
    }

    public boolean update (int id, Animal animal) {
        /*
        Purpose: searches getAllAnimals by id provided, if there is a match, update that index with the animal provided
        Input: id and animal
        Return: boolean true if a match is found and updated / false otherwise
        Notes: very similar to search method, not DRY
         */

        int index = -1;
        for (Animal dog : DataProvider.getAllAnimals()) {
            index++;
            if (dog.getId() == id) {

                DataProvider.getAllAnimals().set(index, animal);
                return true;
            }

        }
        return false;
    }
}
