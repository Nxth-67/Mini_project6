import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;


public class Main extends javafx.application.Application {

        public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(javafx.stage.Stage stage) throws Exception {
        javafx.scene.Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("scene_main/main.fxml"));
        stage.setTitle("CRUD");
        stage.setScene(new javafx.scene.Scene(root));
        stage.show();
    }

}