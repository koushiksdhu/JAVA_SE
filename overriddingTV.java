import java.util.*;
import java.lang.*;

public class overriddingTV {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        TV t1 = new TV();
        t1.switchON();
        t1.changeChannel();
        smartTV t2 = new smartTV();
        t2.switchON();
        t2.changeChannel();
        t2.browse();
        TV t = new smartTV();
        t.switchON();
        t.changeChannel();
        //t.browse();
        }    
}

class TV{
    public void switchON(){
        System.out.println("TV is switched ON.");
    }
    public void changeChannel(){
        System.out.println("TV channel is changed successfully.");
    }
}

class smartTV extends TV{
    public void switchON(){
        System.out.println("Smart TV is switched ON successfully.");
    }
    public void changeChannel(){
        System.out.println("Smart TV channel is changed successfully.");
    }
    public void browse(){
        System.out.println("Browsing Channel.");
    }
}
