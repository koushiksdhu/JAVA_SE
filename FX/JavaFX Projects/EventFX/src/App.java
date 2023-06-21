import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class App extends Application implements EventHandler<ActionEvent>{

    Button b;
    int count  = 0;

    @Override
    public void start(Stage stage) throws Exception{
        b = new Button("OK");
        b.setPrefSize(100, 30);
        b.setOnAction(this);

        // Using Anonymous Class
            // b.setOnAction(new EventHandler<ActionEvent>(){
            //     public void handle(ActionEvent ae){
            //         b.setText(""+ ++count);
            //     }
            // });

        // Using Lambda Expression
            b.setOnAction(e ->  b.setText(""+ ++count));

        // b.setMnemonicParsing(true); //  Underscore is not given in the above level.
        FlowPane fp = new FlowPane(b);
        Scene sc = new Scene(fp, 500, 500);
        stage.setScene(sc);
        stage.setTitle("Button Count");
        stage.show();
    }

    // public void handle(ActionEvent ae){
    //     b.setText(""+ ++count);
    // }
    
    public static void main(String args[]){ 
        launch(args);
    }
}



 