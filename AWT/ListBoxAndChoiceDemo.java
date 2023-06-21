import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener, ItemListener{
    List l;
    Choice c;
    TextArea ta;

    public MyFrame(){
        super("Listbox and Choice Application");

        l = new List(7, true);
        c = new Choice();
        ta = new TextArea(20, 40);

        l.add("Monday");
        l.add("Tuesday");
        l.add("Wednesday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");

        c.add("January");
        c.add("February");	
        c.add("March");
        c.add("April");
        c.add("May");	
        c.add("June");
        c.add("July");
        c.add("August");
        c.add("September");
        c.add("October");
        c.add("November");
        c.add("December");

        l.addItemListener(this);
        c.addItemListener(this);
        l.addActionListener(this);

        setLayout(new FlowLayout());
        add(l);
        add(c);
        add(ta);
    }       
        public void itemStateChanged(ItemEvent ie){
            if(ie.getSource() == l)
                ta.setText(l.getSelectedItem());
            else
                ta.setText(c.getSelectedItem());
        }

        public void actionPerformed(ActionEvent ae){
            String list[] = l.getSelectedItems();
            String text = "";
            for(String x : list)
                text += x+"\n";
            ta.setText(text);
        }

        
    }

public class ListBoxAndChoiceDemo {
    public static void main(String args[]){
        MyFrame f = new MyFrame();
        f.setSize(700, 700);
        f.setVisible(true);
    }    
}
