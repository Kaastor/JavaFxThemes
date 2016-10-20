import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import org.aerofx.AeroFX;
import com.aquafx_project.AquaFx;
import com.guigarage.flatterfx.FlatterFX;


public class LookAndFeelsTest extends Application  {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("GUI L&F");
        Button aquaFxButton = new Button("AquaFx");
        Button aeroFxButton = new Button("AeroFx");
        Button flatterButton = new Button("Flatter");
        Button modenaButton = new Button("Default - Modena");
        Button caspianButton = new Button("Default - Caspian");

        ListView<String> listView = new ListView<>();
        listView.getItems().addAll("AquaFx", "AeroFx", "AquaFx");

        aquaFxButton.setOnAction(e -> AquaFx.style());
        aeroFxButton.setOnAction(e -> AeroFX.style());
        flatterButton.setOnAction(e -> FlatterFX.style());
        modenaButton.setOnAction(e -> setUserAgentStylesheet(STYLESHEET_MODENA));
        caspianButton.setOnAction(e -> setUserAgentStylesheet(STYLESHEET_CASPIAN));

        VBox vBox= new VBox();

        vBox.getChildren().addAll(aquaFxButton, aeroFxButton, flatterButton,
                modenaButton, caspianButton, listView);

        Scene scene = new Scene(vBox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
