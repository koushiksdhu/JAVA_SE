import java.awt.*;
import java.awt.event.*;

public class kk extends Frame implements ActionListener{ 
            TextField tf1; 
            TextField tf2, t; 
            Label l1; 
            Button b;
                    kk() { 
                          setTitle("Adder"); 
                          tf1 = new TextField(20); 
                          tf2 = new TextField(20); 
                          b = new Button("Add"); 
                          t = new TextField(20);
                           setLayout(new FlowLayout());
                          add(tf1); 
                          add(tf2); 
                          add(b);
                          add(t);
                          setSize(500,500); 
                          setVisible(true); 

        b.addActionListener(this);
                    }
               public void actionPerformed(ActionEvent e) { 
                if(e.getSource() == b){
                   t.setText(String.valueOf(Integer.parseInt(tf1.getText()) + Integer.parseInt(tf2.getText()))); 
                }
               }

public static void main(String []args) { 
                   new kk();
          } 
}