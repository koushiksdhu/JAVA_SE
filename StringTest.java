import java.util.*;
public class StringTest {
    public static void main(String args[]){
        System.out.println("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //str.reverse();
        // StringBuilder sb = new StringBuilder(str);
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }
}
