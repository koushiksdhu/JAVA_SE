import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame{
    Button b1, b2, b3, b4, b5, b6;

    public MyFrame(){
        super("Grid Bag Layout Application");

        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");
        b4 = new Button("Four");
        b5 = new Button("Five");
        b6 = new Button("Six");

        GridBagLayout gb = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();

        setLayout(gb);


        gbc.gridx = 2;
        gbc.gridy = 1;
        add(b1, gbc);
        
        gbc.gridx = 4;
        gbc.gridy = 1;
        add(b2, gbc);

        gbc.gridx = 3;
        gbc.gridy = 2;
        add(b3, gbc);

        gbc.gridx = 2;
        gbc.gridy = 3;
        add(b4, gbc);

        gbc.gridx = 4;
        gbc.gridy = 3;
        add(b5, gbc);

        gbc.gridx = 3;
        gbc.gridy = 4;
        add(b6, gbc);

        gbc.gridx = 2;
        gbc.gridy = 5;
        add(new Button("Seven"), gbc);
    }
}

public class GridBagLayoutDemo {
    public static void main(String args[]){
        MyFrame f = new MyFrame();
        f.setSize(700, 700);
        f.setVisible(true);
    }    
}
