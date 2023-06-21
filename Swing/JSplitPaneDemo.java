import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ListSelectionListener {
    JSplitPane sp;
    JList list;
    JLabel lbl;
    JScrollPane p1, p2;

    MyFrame(){
        super("Split Pane Demo");
        String cols[] = {"RED", "GREEN", "BLUE", "YELLOW", "MAGENTA", "ORANGE", "BLACK"};
        list = new JList(cols);
        list.setSelectedIndex(0);
        list.addListSelectionListener(this);

        p1 = new JScrollPane(list);

        lbl = new JLabel("");
        lbl.setOpaque(true);
        lbl.setBackground(Color.red);
        
        p2 = new JScrollPane(lbl);

        sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, p1, p2);
        sp.setDividerLocation(200);
        add(sp);
    }

    @Override
    public void valueChanged(ListSelectionEvent e){
        String str = (String)list.getSelectedValue();
        switch(str){
            case "RED": lbl.setBackground(Color.red); 
                        break;
            case "BLUE": lbl.setBackground(Color.blue);
                            break;
            case "GREEN": lbl.setBackground(Color.green);
                        break;
            case "YELLOW": lbl.setBackground(Color.yellow);
                        break;
            case "MAGENTA": lbl.setBackground(Color.magenta);
                        break;
            case "ORANGE": lbl.setBackground(Color.orange);
                        break;
            case "BLACK": lbl.setBackground(Color.black);
                        break;
        }
    }
}

public class JSplitPaneDemo {
    public static void main(String args[]){
        MyFrame f = new MyFrame();
        f.setSize(800, 800);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
