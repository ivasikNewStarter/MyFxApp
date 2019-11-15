package NavigitaionTool;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MainNavTool extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Navigation Tool");

        // Stage stage = new Stage();
        //stage.initModality(Modality.APPLICATION_MODAL);
        //stage.initModality(Modality.WINDOW_MODAL);
        //stage.initModality(Modality.NONE);
        primaryStage.setScene(new Scene(root, 220, 250));
        primaryStage.show();
        //VBox vBox  = new VBox();
        //  Scene scene = new Scene(vBox);
        // stage.setScene(scene);
        //scene.setCursor(Cursor.CLOSED_HAND);
        // stage.showAndWait();
        //Label label1 = new Label();
        // label1.setText("Button clicked");
    }

    public static void main(String[] args) {

        Application.launch(args);
    }
}
