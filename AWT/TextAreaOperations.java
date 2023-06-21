import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener{
    Label l;
    TextArea ta;
    TextField tf;
    Button btn;

    public MyFrame(){
        super("TextArea Application");

        l = new Label("Nothing is typed");
        ta = new TextArea(10, 40); // (rows, columns)
        tf = new TextField(20);
        btn = new Button("Click Me");

        btn.addActionListener(this);

        setLayout(new FlowLayout());
        add(l);
        add(ta);
        add(tf);
        add(btn);
    }
        public void actionPerformed(ActionEvent ae){
            //l.setText(ta.getSelectedText());
            ta.append(tf.getText()); // to append the text written in textfield to the textarea.
            //ta.insert(tf.getText(), ta.getCaretPosition());
            
        }
}


public class TextAreaOperations {
    public static void main(String args[]){
        MyFrame f = new MyFrame();
        f.setSize(600, 600);
        f.setVisible(true);
    }    
}
