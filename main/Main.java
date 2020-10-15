package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import animal.Dog;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setBreed("Doberman");
        dog1.setLifespan(13);
        dog1.setBehavior("Alert");
        dog1.setPrice(500.0);

        System.out.println("Breed " + dog1.getBreed());
        System.out.println("Lifespan " + dog1.getLifespan());
        System.out.println("Behavior " + dog1.getBehavior());
        System.out.println("Price " + dog1.getPrice());

        launch(args);
    }
}
