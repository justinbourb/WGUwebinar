package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Animal;
import model.DataProvider;
import model.Dog;

import java.util.ArrayList;
import java.util.Arrays;

//init() start() stop() launch() are Application methods
//launch() calls init() then start()
public class launcher extends Application {
    
    @Override 
    public void init() {
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../view/MainMenu.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    
    @Override 
    public void stop() {
        
    }
    
    public static void main(String[] args) {
        
        /* Type casting example:
        Animal dog2 = new Dog("Bulldog", "Alert", 13, 500.);
        //((Dog)dog2) casts the Animal object as a Dog object
        //allowing access to the Dog.getSound() method
        ((Dog)dog2).getSound();
        */
        Animal dog1 = new Dog(1, "Siberian Husky", 15, "Crafty", 599.99, true, "Whistles");
        Animal dog2 = new Dog(2, "Alaskan Malamute", 12, "Energetic", 999.99, true, "Climbs");
        Animal dog3 = new Dog(3, "Dalmatian", 15, "Energetic", 1999.99, true, "Gymnastics");
        Animal dog4 = new Dog(4, "Dogo Argentino", 12, "Protective", 1599.99, true, "Rolls Over");
        Animal dog5 = new Dog(5, "Anatolian Shepherd", 12, "Intelligent", 2599.99, false, "Fetches");
        Dog dog6 = new Dog(5, "Anatolian Shepherd", 12, "Intelligent", 2599.99, false, "Fetches");
        ArrayList<Animal> animalArrayList = new ArrayList<>(Arrays.asList(dog1, dog2, dog3, dog4, dog5));

        //for each Animal object in animalArrayList
        for (Animal animal : animalArrayList) {
            DataProvider.addAnimal(animal);
        }

        //calls init() and start() methods
        launch(args);
    }
  }
