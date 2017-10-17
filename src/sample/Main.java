package sample;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
       // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        //Create a root by oode
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setVgap(10);
        root.setHgap(10);

        primaryStage.setTitle("Hello java FX !!"); // set the title of the windows
        primaryStage.setScene(new Scene(root, 800, 600)); // set the size of the windows

        Label greeting = new Label("Welcome to JAvaFX!!");
        greeting.setTextFill(Color.GREEN);
        greeting.setFont(Font.font("Times New Roman", FontWeight.BOLD,70));
        root.getChildren().add(greeting);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
