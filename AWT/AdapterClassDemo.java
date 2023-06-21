import java.awt.*;
import java.awt.event.*;

// class MyAdapterClass extends WindowAdapter{
//     public void windowClosing(WindowEvent we){
//         System.exit(0);
//     }
// }

class MyFrame extends Frame{
    public MyFrame(){
        super("Adapter Class Demo Application");
        // addWindowListener(new MyAdapterClass());

        //  In Same Class :-
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
}

public class AdapterClassDemo {
    public static void main(String args[]){
        MyFrame f = new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
    }    
}
