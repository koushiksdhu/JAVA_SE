import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Scanner;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.event.*;
import javafx.event.ActionEvent;

class Customer{
    private int custid;
    private String name;
    private String address;

    public Customer(int custid, String name, String address){
        this.custid = custid;
        this.name = name;
        this.address = address;
    }

    public int getId(){
        return custid;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }
}

public class App extends Application{
    
    Label l1, l2, l3;
    ComboBox<Integer> cb;
    TextField name, address;
    Button create, save, search;
    HBox hb1, hb2, hb3, hb4;
    VBox vb;
    int count = 0;

    public void start(Stage stage) throws Exception{

        HashMap <Integer, Customer> data = new HashMap<>();

        Font f = new Font("Times New Roman", 20);
        l1 = new Label("Customer Box"); l1.setFont(f);
        cb = new ComboBox<>();
        hb1 = new HBox();
        hb1.getChildren().addAll(l1, cb);
        hb1.setSpacing(20);
        hb1.setPadding(new Insets(10, 10, 10, 10));
        
        l2 = new Label("Name"); l2.setFont(f);
        name = new TextField();
        name.setPrefColumnCount(15);
        name.setStyle("-fx-text-style: 20");
        hb2 = new HBox();
        hb2.getChildren().addAll(l2, name);
        hb2.setSpacing(20);
        hb2.setPadding(new Insets(10, 10, 10, 10));

        l3 = new Label("Address"); l3.setFont(f);
        address = new TextField();
        address.setPrefColumnCount(20);
        address.setStyle("-fx-text-style: 20");
        hb3 = new HBox();
        hb3.getChildren().addAll(l3, address);
        hb3.setSpacing(20);
        hb3.setPadding(new Insets(10, 10, 10, 10));

        create = new Button("Create"); create.setFont(f);
        save = new Button("Save"); save.setFont(f);
        search = new Button("Search"); search.setFont(f);
        hb4 = new HBox();
        hb4.getChildren().addAll(create, save, search);
        hb4.setSpacing(20);
        hb4.setPadding(new Insets(10, 10, 10, 10));

        create.setOnAction(e -> {
            name.setText("");
            address.setText("");
            cb.setValue(++count);
        });

        save.setOnAction(e -> {
           data.put(count, new Customer(count, name.getText(), address.getText()));
           try(PrintStream ps = new PrintStream(new FileOutputStream("Customer.txt"))){
                for(Customer cust : data.values()){
                ps.println(cust.getId());
                ps.println(cust.getName());
                ps.println(cust.getAddress());
                }
           }
           catch(Exception ex){}
        });

        search.setOnAction(e -> {
            if(cb.getValue() != null){
                int c = cb.getValue();
                Customer cust = data.get(c);
                name.setText(cust.getName());
                address.setText(cust.getAddress());
            }
        });

        cb.valueProperty().addListener(e -> {
            if(cb.getValue() != null){
                int c = cb.getValue();
                Customer cust = data.get(c);
                name.setText(cust.getName());
                address.setText(cust.getAddress());
            }
        });

        try(Scanner sc = new Scanner(new FileInputStream("Customer.txt"))){
            int c;
            String n = null, a;
            while(sc.hasNext()){
                c = sc.nextInt();
                n = sc.next();
                a = sc.next();
                data.put(c, new Customer(c, n, a));
                cb.getItems().add(c);
                if(c > count)
                    count = c;
            }
        }
        catch(Exception ce){}

        vb = new VBox();
        vb.getChildren().addAll(hb1, hb2, hb3, hb4);

        Scene sc = new Scene(vb, 500, 500);
        stage.setScene(sc);
        stage.setTitle("Application Form");
        stage.show();
    }

    public static void main(String args[]){
        launch(args);
    }
}