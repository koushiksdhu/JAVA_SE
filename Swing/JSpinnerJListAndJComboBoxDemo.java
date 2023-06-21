import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class MyFrame extends JFrame implements ActionListener, ListSelectionListener, ChangeListener{
    JComboBox cb;
    JList list;
    JSpinner s1, s2;
    JTextField tf;

    MyFrame(){
        super("JComboBox JList and JSpinner Demo");

        String countries[] = {"United States", "Australia", "Hungrary", "Canada", "India", "Japan", "Denmark", "Belgium"};
        String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String weeks[] = {"Moday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday", "Sunday"};

        cb = new JComboBox(countries);
        list = new JList(months);
        list.setVisibleRowCount(5);
        s1 = new JSpinner(new SpinnerListModel(weeks));
        s2 = new JSpinner(new SpinnerNumberModel(1, 1, 31, 1));
        tf = new JTextField(20);

        setLayout(new FlowLayout());
        add(new JScrollPane(list));
        add(cb);
        add(s1);
        add(s2);
        add(tf);
        cb.addActionListener(this);
        list.addListSelectionListener(this);
        s1.addChangeListener(this);
        s2.addChangeListener(this);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if(e.getSource() == s1)
            tf.setText(s1.getValue()+"");
        if(e.getSource() == s2)
            tf.setText(s2.getValue()+"");
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        tf.setText(""+list.getSelectedValue());
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tf.setText((String)cb.getSelectedItem());
    }
}

public class JSpinnerJListAndJComboBoxDemo {
    public static void main(String args[]){
        MyFrame f = new MyFrame();
        f.setSize(800, 800);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
