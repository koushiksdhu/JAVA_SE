import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener{
    JLabel l;
    JComboBox cb;

    public MyFrame(){
        String cities [] = {"New York", "Delhi", "Paris", "Berlin"};
        cb = new JComboBox(cities);
        cb.setSelectedIndex(0);
        cb.setEditable(true);
        cb.addActionListener(this);
        l = new JLabel();
        l.setBackground(Color.RED);
        setLayout(new FlowLayout());
        add(cb);
        add(l);
    }

    public void actionPerformed(ActionEvent e){
        cb = (JComboBox)e.getSource();
        String name = (String)cb.getSelectedItem();
        l.setBackground(Color.GREEN);
        String s = (String)cb.getSelectedItem();
        for(int i = 0; i < cb.getItemCount(); i++){
            if(s.equals(cb.getItemAt(i))) return;
        }
        cb.addItem(s);
    }
}

public class ComboBoxDemo {
    public static void main(String args[]){
    MyFrame f = new MyFrame();
    f.setSize(500, 500);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}
