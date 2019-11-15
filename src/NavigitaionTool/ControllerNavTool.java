package NavigitaionTool;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class ControllerNavTool extends Application {

    public Text actiontarget;

    @FXML
    protected void doOnButtonClick(ActionEvent event) {
        // actiontarget.setText("Safari");

        try {
            Desktop.getDesktop().browse(new URL("https://learning.oreilly.com/home/").toURI());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

       /* try {
            HostServicesDelegate hs = HostServicesFactory.getInstance(this);
            getHostServices().showDocument(String.valueOf(new URI("http://www.google.com")));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }*/
    }

    @FXML
    protected void doOnButtonClick1(ActionEvent actionEvent) {
        try {
            Desktop.getDesktop().browse(new URL("https://refinitiv.sharepoint.com/").toURI());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void doOnButtonClick2(ActionEvent actionEvent) {
        try {
            Desktop.getDesktop().open(new File("C:/Users/")); // C:\Users\u0139221\Desktop
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void doOnButtonClick4(ActionEvent actionEvent) {
        try {
            Desktop.getDesktop().open(new File("Q:/METRICS/CPCA/2019")); // C:\Users\u0139221\Desktop
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}
