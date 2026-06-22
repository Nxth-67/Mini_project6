import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;


public class Main extends javafx.application.Application {

        public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(javafx.stage.Stage stage) throws Exception {
        var view_main.load(getClass().getResource("scene_main/View.fxml"));

        var loader = new FXMLLoader();;
        URL view_main = null;
        loader.setLocation(view_main);
        loader.setController(new Controller_main());

        var scene = new javafx.scene.Scene(loader.load());

        stage.setScene(scene);
        stage.show();
    }

}