import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame{
    Menu file, submenu;

    MenuItem open, save, close, closeall;
    CheckboxMenuItem autoSave;

    TextField tf;

    MyFrame(){
        super("Menu Demo");

        open = new MenuItem("Open");
        save = new MenuItem("Save");
        close = new MenuItem("Close");
        closeall = new MenuItem("Close All");

        autoSave = new CheckboxMenuItem("AutoSave");

        file = new Menu("File");
        submenu = new Menu("Close");

        file.add(open);
        file.add(save);
        file.add(submenu);
        file.add(autoSave);

        submenu.add(close);
        submenu.add(closeall);

        MenuBar mb = new MenuBar();
        mb.add(file);
        setMenuBar(mb);

        tf = new TextField(20);
        
        setLayout(new FlowLayout());
        add(tf);

        open.addActionListener((ActionEvent ae) -> tf.setText("Open"));
        save.addActionListener((ActionEvent ae) -> tf.setText("Save"));
        close.addActionListener((ActionEvent ae) -> tf.setText("Close"));
        closeall.addActionListener((ActionEvent ae) -> tf.setText("Close All"));

        autoSave.addItemListener((ItemEvent ie) -> {
            if(autoSave.getState())
                tf.setText("AutoSave On");
            else
                tf.setText("AutoSave Off");
        });
    }

} 

public class MenuEvent {
    public static void main(String args[]){
        MyFrame f = new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
    }    
}
