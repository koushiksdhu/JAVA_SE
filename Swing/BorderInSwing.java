import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

class MyFrame extends JFrame{
    JLabel l;
    JTextField tf;
    JButton btn;
    JPanel p;

    MyFrame(){
        l = new JLabel("Name");
        tf = new JTextField(20);
        btn = new JButton("OK");

        p = new JPanel();
        p.add(l);
        p.add(tf);
        p.add(btn);
        
        //Border br = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Login", TitledBorder.CENTER, TitledBorder.LEFT);
        Border br = BorderFactory.createTitledBorder("Login");
        p.setBorder(br);
        
        setLayout(new FlowLayout());	
        add(p);
    }
}

public class BorderInSwing {
    public static void main(String args[]){
        MyFrame f = new MyFrame();
        f.setSize(800, 800);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
