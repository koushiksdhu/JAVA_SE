import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame{
    Button b1, b2, b3, b4, b5;

    public MyFrame(){
        super("BorderLayout Demo");
        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");
        b4 = new Button("Four");
        b5 = new Button("Five");

        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.EAST);
        add(b3, BorderLayout.SOUTH);
        add(b4, BorderLayout.WEST);
        add(b5, BorderLayout.CENTER);
    }

}

public class LMBorderLayout {
    public static void main(String args[]){
        MyFrame f = new MyFrame();
        f.setSize(700, 700);
        f.setVisible(true);
    }    
}
