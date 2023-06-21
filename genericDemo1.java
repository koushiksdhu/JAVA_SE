public class genericDemo1 {
    public static void main(String args[]){
        Object obj[] = new Object[3];
        obj[0] = "Koushik";
        obj[1] = "Sadhu";
        obj[2] = 10; // or obj[2] = new Integer(10);

        String str;
        for(int i = 0; i < obj.length; i++){
            str = (String)obj[i];
            System.out.println(str);
        }
    }
}
