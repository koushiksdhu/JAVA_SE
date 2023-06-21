import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame{
    Button b1, b2, b3, b4;

    public MyFrame(){
        super("Grid Layout");

        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");
        b4 = new Button("Four");

        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.WEST);
        add(b3, BorderLayout.SOUTH);
        add(b4, BorderLayout.CENTER);

        Panel p = new Panel();
        p.setLayout(new GridLayout(3, 1)); // (rows, columns)
        p.add(new Button("Monday"));
        p.add(new Button("Tuesday"));
        p.add(new Button("Wednesday"));
        add(p, BorderLayout.EAST);
    }
}

public class LMGridLayout {
    public static void main(String args[]){
        MyFrame f = new MyFrame();
        f.setSize(700, 700);
        f.setVisible(true);
    }    
}