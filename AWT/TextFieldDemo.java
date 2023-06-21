import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame{
    Label l1, l2;
    TextField tf;

    public MyFrame(){
        super("TextField Application");
        l1 = new Label("Nothing is in TextField");
        l2 = new Label("Hit enter to see the textfield details");
        tf = new TextField(20);
        tf.setEchoChar('*');
        Handler h = new Handler();
        tf.addActionListener(h);
        tf.addTextListener(h);

        setLayout(new FlowLayout());
        add(l1);
        add(tf);
        add(l2);
        

        }

        class Handler implements ActionListener, TextListener{
            public void textValueChanged(TextEvent te){
                l1.setText(tf.getText());
            }
            public void actionPerformed(ActionEvent ae){
                l2.setText(tf.getText());
            }

        }
    }

public class TextFieldDemo {
    public static void main(String args[]){
        MyFrame f = new MyFrame();
        f.setSize(400, 400);
        f.setVisible(true);
    }    
}
