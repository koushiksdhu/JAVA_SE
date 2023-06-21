enum Dept{
    CS, IT, ECE, CIVIL, ME, AIML, CSBS;
}

public class enumDemo1 { 
    public static void main(String args[]){
    Dept d[] = Dept.values();
    for(Dept i : d)
        System.out.println(i);
    
    }
    }
