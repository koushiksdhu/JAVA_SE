import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements WindowListener{
    Label l1;

    public MyFrame(){
        super("Window Event Demo Application");

        l1 = new Label("");

        setLayout(new FlowLayout());
        
        add(l1);

        l1.setBounds(20, 40, 100, 20);

        addWindowListener(this);
    }

    public void windowActivated(WindowEvent ew){
        l1.setText("Window Activated!");
    }

    public void windowClosed(WindowEvent we){
        l1.setText("Window Closed");
    }

    public void windowClosing(WindowEvent we){
        l1.setText("Window Closing");
        System.exit(0);
    }

    public void windowDeactivated(WindowEvent we){
        l1.setText("Window Deactivated");
    }

    public void windowDeiconified(WindowEvent we){
        l1.setText("Window De-Iconified");
    }

    public void windowIconified(WindowEvent we){
        l1.setText("Window Iconified");
    }

    public void windowOpened(WindowEvent we){
        l1.setText("Window Opened");
    }
}

public class WindowEventDemo {
    public static void main(String args[]){
        MyFrame f = new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
    }    
}
