import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame{
    TextField tf;
    Button btn;
    int count = 0;

    public MyFrame(){
        super("Listener Application using Lambda Expression");

        tf = new TextField("0", 20);
        btn = new Button("Count");

        setLayout(new FlowLayout());
        add(tf);
        add(btn);

        btn.addActionListener((ActionEvent ae) -> {
            count++;
            tf.setText(String.valueOf(count));
       });
    }
}

public class ListenersUsingLambdaExpression {
    public static void main(String args[]){
        MyFrame f = new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
    }    
}
