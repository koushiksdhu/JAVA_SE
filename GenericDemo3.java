class Data<T>{
    private T n;
    public void setData(T data){this.n = data;}
    public T getData(){return n;}
}

public class GenericDemo3 {
    public static void main(String args[]){
        Data<Integer> d1 = new Data<>();
        d1.setData(10); //autoboxing
        // d1.setData("Hello"); // Incompatible type, String cannot be converted into Integer.
        System.out.println(d1.getData());
    }
    
}
