import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

class MyFrame extends JFrame implements ChangeListener{
    JSlider sl;
    JPanel p1, p2;
    JProgressBar pb;
    int w = 50;

    MyFrame(){
        super("Slider and Progress Bar Demo");

        sl = new JSlider(0, 100, 50);
        sl.setMajorTickSpacing(10);
        sl.setMinorTickSpacing(10);
        sl.setPaintTicks(true);
        sl.setPaintLabels(true);

        pb = new JProgressBar();
        pb.setString("50%");
        pb.setStringPainted(true);

        // pb.setIndeterminate(true); // for loading animation

        p1 = new JPanel(){
            public void paintComponent(Graphics g){
                g.drawOval(200, 200, w, w);
            }
        };

        p2 = new JPanel();
        p2.add(pb);
        add(sl, BorderLayout.NORTH);
        add(p1, BorderLayout.CENTER);
        add(pb, BorderLayout.SOUTH);

        sl.addChangeListener(this);
    }

    @Override
    public void stateChanged(ChangeEvent ce){
        w = sl.getValue();
        p1.repaint(w);
        pb.setString(w+"%");
        pb.setStringPainted(true);
        pb.setValue(w);
    }
}

public class SliderAndProgressBarDemo {
    public static void main(String args[]){
        MyFrame f = new MyFrame();
        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
