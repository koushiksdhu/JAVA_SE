import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ItemListener{
    Button b1, b2, b3;
    TextField t1, t2, t3;

    Panel p1;
    Panel p2;
    Panel cp;

    Panel mainp;

    Checkbox c, c2;

    CardLayout c1;
    public MyFrame(){
        super("CardLayout Demo");
        CheckboxGroup cg = new CheckboxGroup();

        c = new Checkbox("ONE", true, cg);
        c2 = new Checkbox("TWO", false, cg);

        c.addItemListener(this);
        c2.addItemListener(this);

        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");

        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);

        cp = new Panel();
        cp.add(c);
        cp.add(c2);

        p1 = new Panel();
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);

        p2 = new Panel();
        p2.add(t1);
        p2.add(t2);
        p2.add(t3);

        mainp = new Panel();
        c1 = new CardLayout();
        mainp.setLayout(c1);

        mainp.add("ONE",p1);
        mainp.add("TWO", p2);

        add(cp, BorderLayout.NORTH);
        add(mainp, BorderLayout.CENTER);
    }

    public void itemStateChanged(ItemEvent e){
        if(c.getState())
            c1.first(mainp);
        else
            c1.last(mainp);
    }
}


public class FlowLayoutDemo {
    public static void main(String args[]){
        MyFrame f = new MyFrame();
        f.setSize(700, 700);
        f.setVisible(true);
    }    
}
