import java.util.*;
import java.lang.*;

public class accountChallenge {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

    }    
}

class Account{
    private String acc_no;
    private String name;
    private String address;
    private String phNo;
    private String dob;
    protected long balance;

    public Account(String acc_no, String name, String address, String phNo, String dob, long balance){
        this.acc_no = acc_no;
        this.name = name;
        this.address = address;
        this.phNo = phNo;
        this.dob = dob;
        this.balance = balance;
    }

    public String getAcc_no(){return acc_no;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public String getPhNo(){return dob;}
    public String getDob(){return dob;}
    public long getBalance(){return balance;}

    public void setAddress(String address){this.address = address;}
    public void setPhNo(String phNo){this.phNo = phNo;}
}

class SavingAccount extends Account{
    public void deposit(long amt){
        balance += amt;
    }
    public void withdraw(long amt){
        balance -= amt;
    }
}

class LoanAccount extends Account{
    public void payEMI(long amt){balance -= amt;}
    public void repay(long amt){
        if (balance == amt)
            balance = 0;
    }
}

