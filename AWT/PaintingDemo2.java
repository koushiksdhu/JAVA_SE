import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame{
    int x = 0, y = 0;

    public MyFrame(){
        super("Paint Application");

        //addMouseListener(new MouseAdapter(){
        addMouseMotionListener(new MouseAdapter(){
            //public void mouseClicked(MouseEvent me){
                public void mouseMoved(MouseEvent me){
                x = me.getX();
                y = me.getY();
                repaint();
            }
        });
    }

    public void paint(Graphics g){
        g.setColor(Color.red);
        g.setFont(new Font("Algerain", Font.BOLD, 20));
        g.drawString("Koushik", x, y);
        
        
    }
}

public class PaintingDemo2 {
    public static void main(String args[]){
        MyFrame f = new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);

    }    
}
