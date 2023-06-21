enum D{
    CS("Debashish Chakroborty", "NB"), IT("Anup Kumar Mukhopadhyay", "NB");
    String head,location;
    private D(String head, String location){
        this.head = head;
        this.location = location;
    }

    public String getName(){
        return head;
    }
    public String getLocation(){
        return location;
    }
    public String toString(){
        return "HOD: "+getName()+"\nLocation: "+getLocation()+"\n";
    }
}

public class enumDemo3 {
    public static void main(String args[]){
        //D d = D.CS;
        //D d = D.IT;
        // System.out.println(d);
        D d[] = D.values();
        for(D i : d)
            System.out.println(i);
        
    }
}
