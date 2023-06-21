@SuppressWarnings("Unchecked")
class MyArray<T>{
    T arr[] = (T[]) new Object[4];
    int length = 0;
    public void append(T n){this.arr[length++] = n;}
    public void display(){
        for (T i : arr)
            System.out.println(i);
    }
}

public class GenericDemo4 {
    public static void main(String args[]){
        MyArray<Integer> n1 = new MyArray<>();
        n1.append(10);
        n1.append(20);
        n1.append(30);
        n1.append(40);
        n1.display();
    }    
}
