import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.net.URL;

public class Calc extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader();
        URL FXMLfile = new URL("file:///home/mainak/programs/Java_Programmes_2020/Calculator/main.fxml");
        loader.setLocation(FXMLfile);
        Parent root = loader.load();
        Scene scene = new Scene(root);
        URL S_sheet = new URL("file:///home/mainak/programs/Java_Programmes_2020/Calculator/main.css");
        scene.getStylesheets().add(S_sheet.toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setTitle("               Calculatorium");
        primaryStage.show();
    }

}
