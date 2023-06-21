import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;


public class Swing2{
    public static void main(String args[])
    {
        eframe f=new eframe();
    }

}
class eframe extends JFrame implements ActionListener
{
    JPanel p,p1,p2;
    JLabel l,l1,l2;
    JTextField t,t1,t2;
    JButton b1;
    eframe()
    {
        t=new JTextField(" ",5);
        l=new JLabel("Enter a number");
        p=new JPanel();
        t1=new JTextField(" ",5);
        l1=new JLabel("\n Enter another number");
        p1=new JPanel();
        t2=new JTextField(" ",5);
        l2=new JLabel("Addition is");
        p2=new JPanel();

        b1=new JButton("\n Add");
        p.add(l);
        p.add(t);
        p.add(b1);
        p.add(l1);
        p.add(t1);
        b1.addActionListener(this);
        setContentPane(p);
        setBounds(10,10,400,400);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
            t2.setText(l1+l2);
    }
}