package co.edu.unillanos.msg;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        stage.setScene(new Scene(new StackPane(), 420, 240));
        stage.setTitle("MSG Foundation");
        stage.show();
    }
}