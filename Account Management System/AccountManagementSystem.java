import java.util.*;
import java.io.*;

class Accounts implements Serializable{
    String accno;
    String name;
    double balance;

    Accounts(String accno, String name, double balance){
        this.accno = accno;
        this.name = name;
        this.balance = balance;
    }

    public String toString(){
        return "Account Number: "+accno+"\nAccount Holder Name: "+name+"\nBalance: "+balance+"\n";
    }
}

public class AccountManagementSystem {
    public static void main(String args[])throws Exception{
        Scanner sc = new Scanner(System.in);

        Accounts acc = null;
        HashMap<String, Accounts> hm = new HashMap<>();

        try{
            FileInputStream fis = new FileInputStream("Accounts.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int count = ois.readInt();
            for(int i = 0; i < count; i++){
                acc=(Accounts)ois.readObject();
                System.out.println(acc);
                hm.put(acc.accno, acc);
            }
            fis.close();
            ois.close();
        }
        catch(Exception e){}

        FileOutputStream fos = new FileOutputStream("Accounts.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        System.out.println("        MENU");
        int choice;
        String accno, name;
        double balance = 0.0;

        do{
            System.out.println("1. Create Account");
            System.out.println("2. Delete Account");
            System.out.println("3. View Account");
            System.out.println("4. View All Accounts");
            System.out.println("5. Save Accounts");
            System.out.println("6. Exit");

            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();

            sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            switch(choice){
                case 1: System.out.println("Enter Account Number: ");
                        accno = sc.nextLine();
                        System.out.println("Enter the Account Holder Name: ");
                        name = sc.nextLine();
                        System.out.println("Enter the Amount: ");
                        balance = sc.nextDouble();
                        acc = new Accounts(accno, name, balance);
                        hm.put(accno, acc);
                        System.out.println(name+" Account has been Successfully Created.\n");
                        break;
                    
                case 2: System.out.println("Enter the Account Number: ");
                        accno = sc.nextLine();
                        hm.remove(accno);
                        System.out.println("Account Deleted Successfully.\n");
                        break;

                case 3: System.out.println("Enter the Account Number: ");
                        accno = sc.nextLine();
                        acc = hm.get(accno);
                        System.out.println(acc+"\n");
                        break;

                case 4: for(Accounts a:hm.values())
                            System.out.println(a);
                        System.out.println();
                        break;

                case 5:
                case 6: oos.writeInt(hm.size());
                        for(Accounts a:hm.values())
                            oos.writeObject(a);
            }
        }while(choice != 6);
        oos.flush();
        oos.close();
        fos.close();
    }    
}