public class nestedExceptionHandling{
    public static void main(String args[]){
        try{
        int arr[] = {1, 0, 4, 6, 8};
        try{
            int r = arr[0] / arr[1];
            System.out.println(r);
            }
        catch(ArithmeticException e){
            System.out.println("Denominator Should not be zero.");
        }
        System.out.println(arr[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index is invalid");
        }
        System.out.println("End of the program.");
    }
}
