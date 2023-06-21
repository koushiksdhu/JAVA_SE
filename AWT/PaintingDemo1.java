import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame{
    int x = 0, y = 0;

    public MyFrame(){
        super("Paint Application");

        //addMouseMotionListener(new MouseAdapter(){ // Mouse Motion Sensing listener
        addMouseListener(new MouseAdapter(){ // Mouse CLicked Sensing
            //public void mouseMoved(MouseEvent me){ // Mouse Motion sensing
            public void mouseClicked(MouseEvent me){
                x = me.getX();
                y = me.getY();                
                repaint();  // repaint is a method inside Frame Class which is used to call paint method without passing graphics parameters.
            }
        });
    }
    // Mouse Motion sensing
    public void paint(Graphics g){  // Paint is a method available in Frame Class
        g.setColor(Color.RED);
        //g.drawOval(x, y, 40, 40); // draw oval with red outline
        g.fillOval(x, y, 20, 20); // draw oval filled with red color.
    }
}

public class PaintingDemo1 {
    public static void main(String args[]){
        MyFrame f = new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
    }    
}
