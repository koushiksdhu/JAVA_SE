import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements AdjustmentListener{
    TextField tf;
    Scrollbar red, green, blue;

    public MyFrame(){
        super("Scrollbar Demo");

        red = new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);
        green = new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);
        blue = new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);
        tf = new TextField(20);

        red.addAdjustmentListener(this);
        green.addAdjustmentListener(this);
        blue.addAdjustmentListener(this);

        setLayout(null);

        red.setBounds(50, 150, 300, 30);
        green.setBounds(50, 200, 300, 30);
        blue.setBounds(50, 250, 300, 30);
        tf.setBounds(50, 30, 300, 50);

        add(tf);
        add(red);
        add(green);
        add(blue);
    }

    public void adjustmentValueChanged(AdjustmentEvent e){
        tf.setBackground(new Color(red.getValue(), green.getValue(), blue.getValue()));
    }
}

public class ScrollbarDemo {
    public static void main(String args[]){
        MyFrame f = new MyFrame();
        f.setSize(700, 700);
        f.setVisible(true);
    }    
}
