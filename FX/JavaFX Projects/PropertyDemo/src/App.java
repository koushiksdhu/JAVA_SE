import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.*;
import javafx.scene.paint.*;

public class App extends Application{
    public void start(Stage stage) throws Exception{
        Button b = new Button("Clic_k Me!"); // Character present after _ is the Mnemonic or Shortcut Character. We can use any character as a Mnemonic Key by placing underscore before that Character [Click _Me] Here, ALT + M can be used to click that button.
        b.setTextFill(Color.BLUE);
        b.setMnemonicParsing(true); // In the label, the first character after underscore(_) is the Mnemonic Character. [Alt + C can be used to click that button.]

        Tooltip tp = new Tooltip("Click on this buton to submit.");
        b.setTooltip(tp); // Label will be displayed when you will hover the mouse cursor to the button.

        // CSS - properties are not case-sensitive
        b.setStyle("-fx-Border-Color: Blue; -fx-background-color: red;");

        Alert a = new Alert(AlertType.INFORMATION,"Button Clciked");

        b.setOnAction(e -> a.show()); // this is a method used for setting up an event handler for a button.

        FlowPane fp = new FlowPane(b);
        Scene sc = new Scene(fp, 400, 400); // (400, 400) is the size of the scene.
        stage.setScene(sc);
        stage.setTitle("Button Property Demo in JavaFX");
        stage.show();
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
