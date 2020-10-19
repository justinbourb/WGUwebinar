package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//init() start() stop() launch() are Application methods
//launch() calls init() then start()
public class launcher extends Application {
    
    @Override 
    public void init() {
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../view/MainMenu.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    
    @Override 
    public void stop() {
        
    }
    
    public static void main(String[] args) {
        
        /* Type casting example:
        Animal dog2 = new Dog("Bulldog", "Alert", 13, 500.);
        //((Dog)dog2) casts the Animal obeject as a Dog object
        //allowing access to the Dog.getSound() method
        ((Dog)dog2).getSound();
        */


        launch(args);
    }
  }
