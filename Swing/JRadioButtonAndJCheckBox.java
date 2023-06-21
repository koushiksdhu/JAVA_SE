import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener{
    JRadioButton r1, r2;
    JCheckBox c1, c2;
    TextField tf;

    MyFrame(){
        super("JCheckBox and JRadioButton Demo");

        tf = new TextField("Koushik Sadhu", 20);
        tf.setBounds(20, 40, 200, 100);

        r1 = new JRadioButton("lower");
        r2 = new JRadioButton("UPPER");
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        c1 = new JCheckBox("Bold");
        c1.setMnemonic(KeyEvent.VK_B);
        c2 = new JCheckBox("Italic");
        c2.setMnemonic(KeyEvent.VK_I);

        c1.addActionListener(this);
        c2.addActionListener(this);
        r1.addActionListener(this);
        r2.addActionListener(this);

        r1.setActionCommand("lower");
        r2.setActionCommand("UPPER");

        setLayout(new FlowLayout());
        add(tf);
        add(c1);
        add(c2);
        add(r1);
        add(r2);
    }

    public void actionPerformed(ActionEvent ae){
        switch(ae.getActionCommand()){
            case "lower": tf.setText(tf.getText().toLowerCase());
                            break;
            case "UPPER": tf.setText(tf.getText().toUpperCase());
                            break;
        }

        int b = 0, i = 0;
        if(c1.isSelected())
            b = Font.BOLD;
        if(c2.isSelected())
            b = Font.ITALIC;
        
            Font f = new Font("Times New Roman", b|i, 15);
            tf.setFont(f);
    }
}

public class JRadioButtonAndJCheckBox {
    public static void main(String args[]){
        MyFrame f = new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
