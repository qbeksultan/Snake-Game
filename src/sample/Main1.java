package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.awt.*;

public class Main1 extends Application {
    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Image image = new Image("file:snakeimage.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(300);
        imageView.setFitWidth(500);

        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc =canvas.getGraphicsContext2D();
        bacground(gc);

        window = primaryStage;
        button = new Button();
        button.setTranslateX(10);
        button.setTranslateY(200);
        button.setText("Start");
        Snake snake = new Snake();
        button.setOnAction(e -> snake.start(primaryStage));
        StackPane layout = new StackPane();
        layout.getChildren().addAll(canvas, imageView, button);



        Scene scene = new Scene(layout, 500,500);
        window.setScene(scene);
        window.show();
    }

    private void bacground(GraphicsContext gc) {
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, 500,500);
    }
}
