import java.io.FileInputStream;

import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;

public class App extends Application {

    Button b1, b2, b3, b4, b5;

    public void start(Stage stage) throws Exception{
        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");
        b4 = new Button("Four");
        b5 = new Button("Five");

        // FlowPane
        FlowPane fp = new FlowPane(); // No Gap will be there between two Buttons.
        fp.getChildren().addAll(b1, b2, b3, b4, b5);
        fp.setHgap(10); // For Horizontal Gap.
        fp.setVgap(10); // For Vertical Gap.

        // TilePane
        TilePane tp = new TilePane(); // By default, there will be some gap between two buttons. - Tile pane will arrange the components in the form of tiles.
        tp.getChildren().addAll(b1, b2, b3, b4, b5);

        //BorderPane: It is useful for arranging the controls like Toolbars or Menus.
        BorderPane bp = new BorderPane();
        bp.setTop(b1);
        bp.setBottom(b2);
        bp.setLeft(b3);
        bp.setRight(b4);
        bp.setCenter(b5);

        // Horizontal Box: Controls will be arranged Horizontally.
        HBox hb = new HBox();
        hb.getChildren().addAll(b1, b2, b3, b4, b5);

        // Vertical Box: Controls will be arranged Vertically.
        VBox vb = new VBox();
        vb.getChildren().addAll(b1, b2, b3, b4, b5);

        // Grid Pane: It is used to form a grid of controls or It can be arranged in rows and columns.
        GridPane gp = new GridPane();
        gp.add(b1, 0 /*Columns*/, 0 /*Rows*/);
        gp.add(b2, 1, 1);
        gp.add(b3, 2, 2);
        gp.add(b4, 4, 4);
        gp.add(b5, 10, 10); // No gap will be there if there is not control in any Column and Row.

        // Split Pane and Scroll Pane:
        ImageView i1 = null;
        ImageView i2 = null;

        i1 = new ImageView(new Image(new FileInputStream("C:/Users/kkous/Pictures/apple-featured-image.jpg")));
        i2 = new ImageView(new Image(new FileInputStream("C:/Users/kkous/Pictures/Apple-iOS-MAC-HD-Wallpaper.jpg")));

        ScrollPane sp1 = new ScrollPane(i1);
        ScrollPane sp2 = new ScrollPane(i2);

        SplitPane sp = new SplitPane(sp1, sp2);
        sp.setDividerPositions(0.33, 0.66);

        // Tab Pane:
        ScrollPane s1 = new ScrollPane(i1);
        ScrollPane s2 = new ScrollPane(i2);

        Tab t1 = new Tab("Apple 1", s1);
        Tab t2 = new Tab("Apple 2", s2);

        //TabPane t = new TabPane(t1, t2); // or
        TabPane t = new TabPane();
        t.getTabs().addAll(t1, t2);

        // Titled Pane and Accordion:
        TitledPane tp1 = new TitledPane("Apple 1", s1);
        TitledPane tp2 = new TitledPane("Apple 2", s2);

        Accordion a = new Accordion();
        a.getPanes().addAll(tp1, tp2);

        Scene sc = new Scene(a, 400, 400);
        stage.setTitle("Pane Demo");
        stage.setScene(sc);
        stage.show();
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
