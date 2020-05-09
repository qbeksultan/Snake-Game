package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.ActionEvent;

public class Main1 extends Application {
    Stage window;
    Button button;
    Graphics a;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;
        button = new Button("Click");
        button.setOnAction(e -> System.out.println("Hey"));
        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300,250);
        window.setScene(scene);
        window.show();



    }
}
