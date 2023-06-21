import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.paint.*;

public class App extends Application implements EventHandler<ActionEvent>{

    Text t;
    RadioButton r1, r2, r3;
    ToggleGroup tg; // this is used to group radiobutton so that only one radiobutton should be selected at a time.
    CheckBox c1, c2, c3;
    ChoiceBox<Integer> cb;
    HBox hb1, hb2, hb3, hb4;
    VBox vb;

    public void start(Stage stage) throws Exception{
        t = new Text("My name is Koushik Sadhu");
        hb1 = new HBox();
        hb1.getChildren().add(t);
        hb1.setSpacing(20);
        hb1.setPadding(new Insets(10, 10, 10, 10));

        r1 = new RadioButton("Red");
        r2 = new RadioButton("Green");
        r3 = new RadioButton("Blue");
        tg = new ToggleGroup();
        r1.setToggleGroup(tg);
        r2.setToggleGroup(tg);
        r3.setToggleGroup(tg);
        hb2 = new HBox();
        hb2.getChildren().addAll(r1, r2, r3);
        hb2.setSpacing(20);
        hb2.setPadding(new Insets(10, 10, 10, 10));

        c1 = new CheckBox("Normal");
        c2 = new CheckBox("Bold");
        c3 = new CheckBox("Italic");
        hb3 = new HBox();
        hb3.getChildren().addAll(c1, c2, c3);
        hb3.setSpacing(20);
        hb3.setPadding(new Insets(10, 10, 10, 10));

        cb = new ChoiceBox<>();
        cb.getItems().addAll(10, 20, 30, 40);
        hb4 = new HBox();
        hb4.getChildren().add(cb);
        hb4.setSpacing(20);
        hb4.setPadding(new Insets(10, 10, 10, 10));

        
        vb = new VBox();
        vb.getChildren().addAll(hb1,  hb2, hb3, cb);
        vb.setSpacing(20);
        vb.setPadding(new Insets(10, 10, 10, 10));

        r1.setOnAction(this);
        r2.setOnAction(this);
        r3.setOnAction(this);
        c1.setOnAction(this);
        c2.setOnAction(this);
        c3.setOnAction(this);
        cb.setOnAction(this);

        Scene sc = new Scene(vb, 700, 700);
        stage.setScene(sc);
        stage.setTitle("Text Manipulation");
        stage.show();

    }

    public void handle(ActionEvent e){
        FontWeight fw = FontWeight.NORMAL;
        FontPosture fp = FontPosture.REGULAR;

        if(r1.isSelected())
            t.setFill(Paint.valueOf("RED"));
        if(r2.isSelected())
            t.setFill(Paint.valueOf("GREEN"));
        if(r3.isSelected())
            t.setFill(Paint.valueOf("BLUE"));

        if(c1.isSelected())
            fw = FontWeight.NORMAL;
        if(c2.isSelected())
            fw = FontWeight.BOLD;
        if(c3.isSelected())
            fp = FontPosture.ITALIC;
        
        t.setFont(Font.font("Times New Roman", fw, fp, cb.getValue()));
    }

    public static void main(String args[]){
        launch(args);
    }
}