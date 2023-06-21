import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ItemListener{
    Button b1, b2, b3;
    TextField t1, t2,t3;

    Checkbox c1, c2;

    Panel p1, p2, cb, mainp;

    CardLayout cl;

    public MyFrame(){
        super("Card Layout Demo Application");

        CheckboxGroup cbg = new CheckboxGroup();
        c1 = new Checkbox("ONE", true, cbg);
        c2 = new Checkbox("TWO", false, cbg);
        
        c1.addItemListener(this);
        c2.addItemListener(this);

        b1 = new Button("Button 1");
        b2 = new Button("Button 2");
        b3 = new Button("Button 3");

        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);

        cb = new Panel();
        cb.add(c1);
        cb.add(c2);

        p1 = new Panel();
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);

        p2 = new Panel();
        p2.add(t1);
        p2.add(t2);
        p2.add(t3);

        mainp = new Panel();
        cl = new CardLayout();
        mainp.setLayout(cl);
        mainp.add("One", p1);
        mainp.add("Two", p2);

        add(cb, BorderLayout.NORTH);
        add(mainp, BorderLayout.CENTER);
    }

        public void itemStateChanged(ItemEvent ie){
            if(c1.getState())
                cl.first(mainp);
            else
                cl.last(mainp);
        }
}

public class CardLayoutDemo {
    public static void main(String args[]){
        MyFrame f = new MyFrame();
        f.setSize(700, 700);
        f.setVisible(true);
    }    
}
