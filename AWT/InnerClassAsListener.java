import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame{
    TextField tf;
    Button btn;
    int count = 0;

    public MyFrame(){
        super("Inner Class as Listener Application");

        tf = new TextField("0", 20);
        btn = new Button("Count");

        setLayout(new FlowLayout());

        add(tf);
        add(btn);

        btn.addActionListener(new Listener());
    }

    class Listener implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            count++;
            tf.setText(String.valueOf(count));
        }
    }
}

public class InnerClassAsListener {
    public static void main(String args[]){
        MyFrame f = new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
    }    
}
