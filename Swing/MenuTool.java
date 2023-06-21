import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;

class MyFrame extends JFrame implements ActionListener{
    JToolBar tb;
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7;
    JTextArea ta;
    JScrollPane sp;
    JMenuBar mb;
    JMenu file;
    JMenuItem m1, m2;

    MyFrame(){
        super("ToolBar Demo");
        tb = new JToolBar(); // Docking or Floating ToolBar.
        btn1 = new JButton("New");
        btn2 = new JButton("Open");
        btn3 = new JButton("Save");
        btn4 = new JButton("Cut");
        btn5 = new JButton("Copy");
        btn6 = new JButton("Split");
        btn7 = new JButton("Close");

        tb.add(btn1);
        tb.add(btn2);
        tb.add(btn3);
        tb.add(new JToolBar.Separator());
        tb.add(btn4);
        tb.add(btn5);
        tb.add(btn6);
        tb.add(btn7);

        ta = new JTextArea();
        sp = new JScrollPane(ta);

        add(tb, BorderLayout.NORTH);
        add(sp, BorderLayout.SOUTH);

        mb = new JMenuBar();
        file = new JMenu("File");
        m1 = new JMenuItem("Open");
        m1.setMnemonic(KeyEvent.VK_O);
        m2 = new JMenuItem("Save");
        m2.setMnemonic(KeyEvent.VK_S);

        file.add(m1);
        file.addSeparator();
        file.add(m2);
        mb.add(file);
        setJMenuBar(mb);
        btn2.setActionCommand("Open");

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        m1.addActionListener(this);
        m2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("Open")){
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(this);
            File f = fc.getSelectedFile();

            try{
                FileInputStream fi = new FileInputStream(f);
                byte b[] = new byte[fi.available()];
                fi.read(b);
                String str = new String(b);
                ta.setText(str);
                fi.close();
            }
            catch(Exception e){}
        }
        else{
            Color col = JColorChooser.showDialog(this, "Font Color", Color.RED);
            ta.setForeground(col);
        }
    }
}

public class MenuTool {
    public static void  main(String args[]){
        MyFrame f = new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}