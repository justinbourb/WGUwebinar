package controller;



import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class DisplayAnimalController implements Initializable {


    @FXML
    private AnchorPane anchorPane;

    @FXML
    private VBox vbox;

    @FXML
    private TableView<?> displayAnimalTable;

    @FXML
    private TableColumn<?, ?> idColumn;

    @FXML
    private TableColumn<?, ?> breedColumn;

    @FXML
    private TableColumn<?, ?> lifespanColumn;

    @FXML
    private TableColumn<?, ?> priceColumn;

    @FXML
    private HBox buttonHbox;

    @FXML
    private Button detailsButton;

    @FXML
    private Button backButton;



    @FXML
    void onActionDisplayAnimalDetailsMenu(ActionEvent event) {
        
    }
    
     @FXML
    void onActionDisplayMainMenu(ActionEvent event) {
        
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("initialized");
    }

}
