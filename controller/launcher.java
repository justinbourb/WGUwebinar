package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Dog;

//init() start() stop() launch() are Application methods
//launch() calls init() then start()
public class launcher extends Application {
    
    @Override 
    public void init() {
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../view/mainMenuView.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }
    
    @Override 
    public void stop() {
        
    }
    
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setBreed("Doberman");
        dog1.setLifespan(13);
        dog1.setBehavior("Alert");
        dog1.setPrice(500.0);
        
        /* Type casting example:
        Animal dog2 = new Dog("Bulldog", "Alert", 13, 500.);
        //((Dog)dog2) casts the Animal obeject as a Dog object
        //allowing access to the Dog.getSound() method
        ((Dog)dog2).getSound();
        */

        System.out.println("Breed " + dog1.getBreed());
        System.out.println("Lifespan " + dog1.getLifespan());
        System.out.println("Behavior " + dog1.getBehavior());
        System.out.println("Price " + dog1.getPrice());

        launch(args);
    }
  }
