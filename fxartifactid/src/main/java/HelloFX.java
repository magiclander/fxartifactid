
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;


public class HelloFX extends Application {
    @FXML

    @Override
     public void start(Stage primaryStage) throws Exception{
        URL location = getClass().getResource("fxml/base.fxml");
        Parent root = FXMLLoader.load(location);
        primaryStage.setTitle("MZX");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }



}
