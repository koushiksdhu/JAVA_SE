import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener{
    JLayeredPane jp;
    JRadioButton r1, r2, r3, r4;
    JLabel l1, l2, l3, l4;

    MyFrame(){
        super("Layered Pane");

        r1 = new JRadioButton("Red");
        r2 = new JRadioButton("Green");
        r3 = new JRadioButton("Blue", true);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);

        JPanel p = new JPanel();
        p.add(r1);
        p.add(r2);
        p.add(r3);

        l1 = new JLabel("RED");
        l1.setBounds(10, 10, 200, 200);
        l1.setBackground(Color.red);
        l1.setOpaque(true);

        l2 = new JLabel("Green");
        l2.setBounds(50, 50, 250, 250);
        l2.setBackground(Color.green);
        l2.setOpaque(true);

        l3 = new JLabel("Blue");
        l3.setBounds(70, 70, 300, 300);
        l3.setBackground(Color.blue);
        l3.setOpaque(true);

        l4 = new JLabel("b");
        l4.setBounds(100, 100, 150, 150);
        l4.setBackground(Color.black);
        l4.setOpaque(true);

        jp = new JLayeredPane();
        jp.add(l1, 0);
        jp.add(l2, 1);
        jp.add(l3, 2);
        jp.add(l4, 3);

        add(p, BorderLayout.NORTH);
        add(jp, BorderLayout.CENTER);

        addMouseMotionListener(new MouseAdapter(){
            public void mouseMoved(MouseEvent me){
                l4.setLocation(me.getX(), me.getY());
            }
        });
    }
    public void actionPerformed(ActionEvent ae){
        if(r1.isSelected())
            jp.setLayer(r1, 14, 1);
        if(r2.isSelected())
            jp.setLayer(r2, 14, 2);
        if(r2.isSelected())
            jp.setLayer(r3, 14, 3);
    }
}

public class LayeredDemo {
    public static void main(String args[]){
        MyFrame f = new MyFrame();
        f.setSize(800, 800);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
