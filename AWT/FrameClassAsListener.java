import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener{
    TextField tf;
    Button btn;
    int count = 0;

    public MyFrame(){
        super("Frame Class as a Listener Application");

        tf = new TextField("0", 20);
        btn = new Button("Count");

        setLayout(new FlowLayout());

        add(tf);
        add(btn);

        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae){
        count++;
        tf.setText(String.valueOf(count));
    }
}

public class FrameClassAsListener {
    public static void main(String args[]){
        MyFrame f = new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
    }    
}
