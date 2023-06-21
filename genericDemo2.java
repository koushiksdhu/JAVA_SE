@SuppressWarnings("Unchecked")
public class genericDemo2<T> {
    T data[] = (T[]) new Object[3];    

    public static void main(String args[]){
        genericDemo2<String> gd = new genericDemo2<>();
        gd.data[0] = "Koushik";
        gd.data[1] = "Sadhu";
        // gd.data[3] = 10; //Compile Time Error.
        gd.data[2] = "Engineer";
        String str = gd.data[0]; // No need to Typecast.
        System.out.println(str);
    }
}
