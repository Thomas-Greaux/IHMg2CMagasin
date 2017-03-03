import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by Thoma on 3/1/2017.
 */
public class MainApp extends Application{

    private Stage primaryStage;
    private BorderPane rootLayout;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("MagasinApp");

        initializeRootLayout();
    }

    public void initializeRootLayout() throws Exception {
        // Load root layout from fxml file.
        FXMLLoader loader = new FXMLLoader();
        String fxmlFile = "/Fxml/shopMain.fxml";
        Parent rootNode = (Parent) loader.load(getClass().getResourceAsStream(fxmlFile));
        loader.setLocation(MainApp.class.getResource(fxmlFile));
        //rootLayout = (BorderPane) loader.load();

        // Show the scene containing the root layout.
        Scene scene = new Scene(rootNode);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
