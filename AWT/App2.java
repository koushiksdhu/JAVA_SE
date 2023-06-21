import java.awt.*;

// class App extends Frame{
//     Label l;
//     TextField tf;
//     Button b;
//     public App(){
//         super("My Second App");
//         l = new Label("Name ");
//         tf = new TextField(20);
//         b = new Button("Submit");
//         add(l);
//         add(tf);
//         add(b);
//     }
// }

// public class App2 {
//     public static void main(String args[]){
//         App a = new App();
//         a.setSize(400, 400);
//         a.setLayout(new FlowLayout());
//         a.setVisible(true);
//     }    
// }

// Writing in main class

public class App2 extends Frame{

    Label l;
    TextField tf;
    Button b;
    public App2(){
        super("My Second App");
        l = new Label("Name ");
        tf = new TextField(20);
        b = new Button("Submit");
        add(l);
        add(tf);
        add(b);
    }
    public static void main(String args[]){
        App2 a = new App2();
        a.setSize(400, 400);
        a.setLayout(new FlowLayout());
        a.setVisible(true);
    }    
}
