import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements MouseListener, MouseMotionListener{
    Label l1, l2;

    public MyFrame(){
        super("Mouse Event Demo Application");

        l1 = new Label("");
        l2 = new Label("");

        setLayout(null);

        l1.setBounds(10, 40, 100, 20);
        l2.setBounds(10, 80, 100, 20);

        add(l1);
        add(l2);

        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void mouseEntered(MouseEvent me){
        l1.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent me){
        l1.setText("Mouse Exited");
    }

    public void mouseClicked(MouseEvent me){
        l1.setText("Mouse Clicked");
    }

    public void mousePressed(MouseEvent me){
        l1.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent me){
        l1.setText("Mouse Released");
    }

    public void mouseMoved(MouseEvent me){
        l1.setText("Mouse Moved");
        l2.setText("("+me.getX()+", "+me.getY()+")");
    }

    public void mouseDragged(MouseEvent me){
        l1.setText("Mouse Dragged");
    }
}

public class MouseEventDemo {
    public static void main(String args[]){
        MyFrame f = new MyFrame();
        f.setSize(700, 700);
        f.setVisible(true);
    }    
}
