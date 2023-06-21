enum Dept{
    CS("Debashish Chakroborty", "New Building"), IT("Anup Kr. Mukhopadhyay", "New Building");
    
    private Dept(String HOD, String location){

    }
}

public class enumDemo2 {
    public static void main(String args[]){
    Dept d = Dept.IT;
    System.out.println(d.name());
    System.out.println(d.ordinal());
    System.out.println(Dept.valueOf("IT"));
    System.out.println(d);
    }
}
