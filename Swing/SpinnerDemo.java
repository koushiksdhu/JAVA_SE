import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

class MyFrame extends JFrame implements ActionListener, ListSelectionListener, ChangeListener{
    JComboBox cb;
    JList list;
    JSpinner sp1, sp2;
    JTextField tf;

    MyFrame(){
        super("Spinner Demo");

        String countries[] = {"India", "US", "UK", "Canada", "Australia"};
        String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        cb = new JComboBox(countries);
        list = new JList(months);
        list.setVisibleRowCount(5);
        tf = new JTextField(15);

        sp1 = new JSpinner(new SpinnerNumberModel(1, 1, 31, 1));
        sp2 = new JSpinner(new SpinnerListModel(days));

        setLayout(new FlowLayout());
        add(cb);
        add(sp1);
        add(sp2);
        add(new JScrollPane(list));
        add(tf);
        cb.addActionListener(this);
        list.addListSelectionListener(this);
        sp1.addChangeListener(this);
        sp2.addChangeListener(this);
    }

    public void actionPerformed(ActionEvent ae){
        tf.setText((String)cb.getSelectedItem());
    }

    @Override
    public void valueChanged(ListSelectionEvent e){
        tf.setText((String)list.getSelectedValue());
    }

    @Override
    public void stateChanged(ChangeEvent e){
        if(e.getSource() == sp1)
            tf.setText(sp1.getValue()+"");
        else
            tf.setText((String)sp2.getValue());
    }
}

public class SpinnerDemo {
    public static void main(String args[]){
        MyFrame f = new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
