import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener {
    JLabel l;
    JButton btn;
    int count = 0;

    MyFrame(){
        super("Click on Count Swing Demo");
        l = new JLabel("Clicked "+count+" times");
        btn = new JButton("Click here");
        setLayout(new FlowLayout());
        add(l);
        add(btn);
        btn.addActionListener(this); // Adding Action Listener to JButton btn.
        getRootPane().setDefaultButton(btn); // Seting btn as the Default button in the panel so that by deafult that button will be selected and when enter will be pressed the button will be clicked.
        add(new JButton("Cancel")); // to ckeck whether the default button is selected or not.
        btn.setIcon(new ImageIcon("D:/MY FILES/MY PHOTOS/PHOTOS/Untitled-1.png")); // Setting Image Icon in place of button.
        l.setToolTipText("This is the annotation"); // Setting annotation for label l so that when that label will be hovered annotation will be displayed.
    }
    
    public void actionPerformed(ActionEvent ae){ // Action that is to be performed.
        count++;
        l.setText("Clicked "+count+" times");
    }
}

public class CountOnClick {
    public static void main(String args[]){
        MyFrame f = new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit program when JFrame is closed.
    }    
}
