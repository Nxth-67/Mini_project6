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
        var view_main = this.getClass().getResource("scene_main/View.fxml");
        var controller_main = new scene_main.Controller();

        var loader = new FXMLLoader();;
        loader.setLocation(view_main);
        loader.setController(controller_main);

        var scene = new javafx.scene.Scene(loader.load());

        stage.setScene(scene);
        stage.show();
    }

}