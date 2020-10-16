package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class mainMenuController implements Initializable {
    
    @FXML
    private AnchorPane anchorPane;

    @FXML
    private VBox vbox;

    @FXML
    private Button createButton;

    @FXML
    private Button displayButton;

    @FXML
    private Button exitButton;
    
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
        
    }


}
