import java.io.FileInputStream;
import java.util.Scanner;
import java.io.*;
import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.text.*;
import javafx.geometry.*;

public class App extends Application{

    TextArea ta;
    Slider sl;
    VBox vb;
    Button b;
    DatePicker dp;
    ColorPicker cp;
    FileChooser fc;

    public void start(Stage stage) throws Exception{
        ta = new TextArea();
        ta.setPrefColumnCount(100);
        ta.setPrefRowCount(20);

        sl = new Slider(10, 100, 10);
        sl.setMajorTickUnit(5);
        sl.setShowTickMarks(true);

        sl.valueProperty().addListener(e -> ta.setFont(Font.font(sl.getValue())));

        dp = new DatePicker();
        dp.setShowWeekNumbers(true);
        dp.setOnAction(e -> ta.setText("Date: "+dp.getValue()+"\n\n"+ta.getText()));

        cp = new ColorPicker();
        cp.setOnAction(e -> ta.setStyle("-fx-text-fill:#"+cp.getValue().toString().substring(2, 8))); // Ox[rrggbb]ff only [] part hexcode is needed that's why substring is being used over there.

        Button b = new Button("Open File");
        b.setOnAction(e -> {
            fc = new FileChooser();
            java.io.File file = fc.showOpenDialog(stage);

            try(Scanner sc = new Scanner(new FileInputStream(file))){
                String str = "";
                while(sc.hasNext())
                    str += sc.nextLine()+"\n";
                ta.setText(str);
                
            }
            catch(Exception ee){ta.setText("Select Valid File");}
        });

        vb = new VBox();
        vb.setAlignment(Pos.TOP_CENTER);
        vb.setSpacing(20);
        vb.getChildren().addAll(ta, sl, dp, cp, b);

        Scene sc = new Scene(vb, 700, 700);
        stage.setScene(sc);
        stage.setTitle("TextArea and Slider JavaFX Demo");
        stage.show();
        }

    public static void main(String args[]){
        launch(args);
    }
}