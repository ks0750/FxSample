package jp.ascendia.sample.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class SampleApplication extends Application {

    public void start(Stage stage) throws Exception {
        AnchorPane main = FXMLLoader.load(SampleApplication.class.getResource("Main.fxml"));

        stage.setTitle("Ascendia");
        stage.setScene(new Scene(main, 800, 600));
        stage.show();
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }

}
