package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
        button = new Button();
        button.setText("Start");
        Snake snake = new Snake();
        button.setOnAction(e -> snake.start(primaryStage));
        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        /*Image image = new Image("snake.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setX(50);
        imageView.setY(50);*/

        Scene scene = new Scene(layout, 500,500);
        window.setScene(scene);
        window.show();




    }
}
