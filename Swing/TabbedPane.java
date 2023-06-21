import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ListSelectionListener{
    JTabbedPane tp;
    JList list;
    JLabel lbl;
    JScrollPane p1, p2;

    MyFrame(){
        super("Tabbed Pane Demo");
        String cols[] = {"RED", "GREEN", "BLUE", "YELLOW", "MAGENTA", "ORANGE", "BLACK"};

        list = new JList(cols);
        list.setSelectedIndex(0);
        list.addListSelectionListener(this);
        p1 = new JScrollPane(list);

        lbl = new JLabel("");
        lbl.setOpaque(true);
        lbl.setBackground(Color.red);
        p2 = new JScrollPane(lbl);

        tp = new JTabbedPane();
        tp.addTab("Colors", p1);
        tp.addTab("Labels", p2);

        add(tp);
    }

    @Override
    public void valueChanged(ListSelectionEvent e){
        String str = (String)list.getSelectedValue();
        switch(str){
            case "RED": lbl.setBackground(Color.RED); break;
            case "GREEN": lbl.setBackground(Color.GREEN); break;
            case "BLUE": lbl.setBackground(Color.BLUE); break;
            case "YELLOW": lbl.setBackground(Color.YELLOW); break;
            case "MAGENTA": lbl.setBackground(Color.MAGENTA); break;
            case "ORANGE": lbl.setBackground(Color.ORANGE); break;
            case "BLACK": lbl.setBackground(Color.BLACK);
        }
    }
}

public class TabbedPane {
    public static void main(String args[]){
        MyFrame f = new MyFrame();
        f.setSize(800, 800);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
