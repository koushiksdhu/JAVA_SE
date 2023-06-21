import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// import java.awt.event.MouseAdapter;
// import java.awt.event.MouseEvent;

class MyInternalFrame extends JInternalFrame{
    static int  count = 0;
    JTextArea ta;
    JScrollPane sp;
    MyInternalFrame(){
        super("Document "+(++count), true, true, true, true);

        ta = new JTextArea();
        sp = new JScrollPane(ta);
        add(sp);

        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem m1 = new JMenuItem("Save");

        file.add(m1);
        mb.add(file);
        setJMenuBar(mb);
        setSize(400, 400);
        setVisible(true);
    }
}

class MyFrame extends JFrame implements ActionListener{
    JDesktopPane jp;
    MyFrame(){
        super("NoteWrite");
        jp = new JDesktopPane();
        setContentPane(jp);

        JMenuBar mb = new JMenuBar();
        JMenu d = new JMenu("Document");
        JMenuItem m1 = new JMenuItem("New");

        d.add(m1);
        mb.add(d);
        setJMenuBar(mb);
        
        m1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae){
        MyInternalFrame f1 = new MyInternalFrame();
        jp.add(f1);
    }
}

public class MiniNotepadUsingSwing {
    public static void main(String args[]){
        MyFrame f = new MyFrame();
        f.setSize(800, 800);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
