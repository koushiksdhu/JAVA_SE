import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ItemListener{
    Label l;
    Checkbox c1;
    Checkbox c2;
    Checkbox c3;

    CheckboxGroup cbg;

    public MyFrame(){
        super("Radiobutton App");
        cbg = new CheckboxGroup();
        l = new Label("Nothing is selected");
        c1 = new Checkbox("Java", false, cbg);
        c2 = new Checkbox("C++", false, cbg);
        c3 = new Checkbox("Python", false, cbg);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        setLayout(new FlowLayout());
        add(l);
        add(c1);
        add(c2);
        add(c3);
    }
        public void itemStateChanged(ItemEvent e){
            String str = " ";
            if(c1.getState())
                str = str+" "+c1.getLabel();
            if(c2.getState())
                str = str+" "+c2.getLabel();
            if(c3.getState())
                str = str+" "+c3.getLabel();
            if(str.isEmpty()) 
                str = "Nothing is Selected";
            l.setText(str);
        }
    }


public class ChecboxGroupDemo {
    public static void main(String args[]){
        MyFrame f = new MyFrame();
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
