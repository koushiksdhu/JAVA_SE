import java.lang.*;
import java.util.*;

public class productConsumer {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
    } 
}

class Product{
    private String itemNo;
    private String name;
    private double price;
    private int qty;

    public String getItemNo(){
        return itemNo;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQty(){
        return qty;
    }

    public Product(String itNo, String inName){
        itemNo = itNo;
        name = inName;
    }
   
    public void setPrice(int prc){
        price = prc;
    }
    public void setQty(int quantity){
        qty = quantity;
    }
}

class Customer{
    private String custID;
    private String name;
    private String address;
    private long phNo;

    public String setCustId(){
        return custID;
    }
    public String setName(){
        return name;
    }
    public String setAddress(){
        return address;
    }
    public long setPhNo(){
        return phNo;
    }

    public Customer(String custID, String name){
        this.custID = custID;
        this.name = name;
    }
    public void getAddress(String address){
        this.address = address;
    }
    public void getphNo(long ph){
        phNo = ph;
    }
}