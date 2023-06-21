import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import javax.swing.tree.*;
import java.io.*;
import java.util.StringTokenizer;

class MyFrame extends JFrame implements TreeSelectionListener{
    JTree tree;
    JLabel label;
    JScrollPane sp;

    MyFrame(){
        super("Path Tree Demo in Swing");
        //valid path must be given.
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("E:\\Coding\\Java");
        File f = new File("E:/Coding/Java");

        for (File x : f.listFiles()){
            if(x.isDirectory()){
                DefaultMutableTreeNode t = new DefaultMutableTreeNode(x.getName());
                for(File y : x.listFiles()){
                    t.add(new DefaultMutableTreeNode(y.getName()));
                }
                root.add(t);
            }
            else  
                root.add(new DefaultMutableTreeNode(x.getName()));
        }

        tree = new JTree(root);
        label = new JLabel("No Files Selected");

        tree.addTreeSelectionListener(this);

        sp = new JScrollPane(tree);
        add(sp, BorderLayout.CENTER);
        add(label, BorderLayout.SOUTH);
        
    }

    public void valueChanged(TreeSelectionEvent e){
        label.setText(e.getPath().toString());
    }
}

public class PathTreeInSwing {
    public static void main(String args[]){
        MyFrame f = new MyFrame();
        f.setSize(500, 800);
        f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
