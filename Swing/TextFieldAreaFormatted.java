import java.awt.*;
import javax.swing.*;
import java.text.*;
import java.util.*;
import javax.swing.text.NumberFormatter;

class MyFrame extends JFrame{
    TextField tf1;
    JFormattedTextField tf2;
    TextArea ta;

    MyFrame(){
        tf1 = new TextField(20);
        

        //NumberFormat nf = NumberFormat.getInstance(); // Creating Instance
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US); // For Currency DateFormat
        NumberFormatter nft = new NumberFormatter(nf);

        DateFormat df = new SimpleDateFormat("dd/MMMM/yyyy");
        Date d = new Date();
        tf2 = new JFormattedTextField(df.format(d));
        
        nft.setAllowsInvalid(false);
        nft.setMaximum(10000);
        // tf2 = new JFormattedTextField(nft);
        tf2.setColumns(20);
        //tf2.setValue(0);
        ta = new TextArea();  
        ta = new TextArea(20, 20);

        setLayout(new FlowLayout());
        add(tf1);
        add(tf2);
        add(ta);
    }
}

public class TextFieldAreaFormatted {
    public static void main(String args[]){
        MyFrame f = new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
