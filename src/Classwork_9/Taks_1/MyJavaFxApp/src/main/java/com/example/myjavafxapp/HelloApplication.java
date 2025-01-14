package Classwork_9.Taks_1.MyJavaFxApp.src.main.java.com.example.myjavafxapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        Label nameLabel = new Label("name");
        TextField nameField = new TextField();

        Label surnameLabel = new Label("Surname");
        TextField surnameField = new TextField();

        Button submitButton = new Button("Submit");

        Label result = new Label();

        submitButton.setOnAction(event -> {
            String name = nameField.getText();
            String surname = surnameField.getText();
            result.setText(name + " " + surname);
        });

        VBox vbox = new VBox(nameLabel, nameField, surnameLabel, surnameField, submitButton, result);
        vbox.setStyle("-fx-padding: 20px");
        Scene scene = new Scene(vbox, 400, 400);
        stage.setTitle("my application");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}