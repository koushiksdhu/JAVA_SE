import java.awt.*;
import java.awt.event.*;


public class Swing2{
    public static void main(String args[])
    {
        eframe f=new eframe();
        f.setSize(500, 500);
        f.setVisible(true);
    }

}
class eframe extends Frame implements ActionListener
{

    Label l,l1, l2;
    TextField t,t1,t2;
    Button b1;
    eframe()
    {
        l = new Label("Enter the number: ");
        t = new TextField(" ",5);
        t1=new TextField(" ",5);
        l1=new Label("Enter another number");
        t2=new TextField(" ",5);
        l2=new Label("Addition is");

        b1=new Button("Add");
        
        b1.addActionListener(this);
        setLayout(new FlowLayout());
        add(l);
        add(t);
        add(l1);
        add(t1);
        add(b1);
        add(t2);
        
    }
    public void actionPerformed(ActionEvent e)
    {
        int a, b, sum;
        if(e.getSource()==b1){
            a = Integer.parseInt(t.getText());
            b = Integer.parseInt(t1.getText());
            sum =  a+b;
            t.setText(""+sum);
        }
    }
}