import java.awt.*;

public class FIrstApp {
    public static void main(String args[]){
        Frame f = new Frame("My First App");
        f.setTitle("My First Application");        

        Label l = new Label("Name");
        f.add(l);
        TextField tf = new TextField(20);
        f.add(tf);
        Button b = new Button("Submit");
        f.add(b);
        

        f.setLayout(new FlowLayout());
        f.setSize(600, 600);
        f.setVisible(true);
    }
}
