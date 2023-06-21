import java.net.URL;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.*;
import javafx.scene.layout.*;

public class App extends Application{
    Button button1 = new Button();
    int count = 0;
    VBox vb;
    @Override
    public void start(Stage stage)throws Exception{
        FXMLLoader ld = new FXMLLoader();
        ld.setLocation(new URL("FXMLTest.fxml"));
        vb = ld.<VBox>load();
        Scene sc = new Scene(vb, 400, 400);
        stage.setScene(sc);
        stage.show();
    }

    public static void main(String args[]){
        launch(args);
    }
}
