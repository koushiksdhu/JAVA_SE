import java.io.*;
import java.util.*;

class Customer implements Serializable {
    public String cid;
    public String name;
    public String mob;
    public static int count = 1;

    public Customer(){};
    public Customer(String name, String mob){
        this.cid = "C"+count++;
        this.name = name;
        this.mob = mob;
    }

    public String toString(){
        return "Customer Details: \n\nCustomer ID: "+cid+"\nName: "+name+"\nMobile No.: "+mob+"\n";
    }
}

public class StoreAndRetrieveObjects {
    public static void main(String args[])throws Exception{
        // Customer list[] = {new Customer("Jaydev Sadhu", "7896541230"), new Customer("Tapas Sadhu", "9955107783"), new Customer("Taraknath Sadhu", "9973764505"), new Customer("Somnath Sadhu", "7992321676")};
        // FileOutputStream fos = new FileOutputStream("ObjectFile.txt");
        // ObjectOutputStream oos = new ObjectOutputStream(fos);
        // oos.writeInt(list.length);
        // for (int i = 0; i < list.length; i++)
        //     oos.writeObject(list[i]);
        // fos.close();
        // oos.close();

        FileInputStream fis = new FileInputStream("ObjectFile.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        int l = ois.readInt();
        Customer list1[] = new Customer[l];

        // Printing all the customer details present in the list.

        for(int i = 0; i < l; i++){
            list1[i] = (Customer)ois.readObject(); 
            System.out.println(list1[i]);
        }

        // Searching customer details by their name.

        // System.out.print("Enter the Customer Name: ");
        // Scanner sc = new Scanner(System.in);
        // String n = sc.nextLine();
        // for(int i = 0; i < l; i++){
        //     list1[i] = (Customer)ois.readObject();
        //     if(n.equalsIgnoreCase(list1[i].name))
        //         System.out.println(list1[i]);
        // }
        fis.close();
        ois.close();
    }    
}
