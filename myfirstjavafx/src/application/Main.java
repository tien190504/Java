package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button button = new Button("Click me!");
        button.setOnAction(e -> System.out.println("Button clicked"));

        Scene scene = new Scene(button, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.setTitle("My First JavaFX Project");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

