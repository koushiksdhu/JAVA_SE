import java.util.*;

public class MaxASCII {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String s = sc.nextLine();
        int max;
        int min;
        String w[] = s.split("\\s");
        for(int i = 0; i < w.length; i++){
            char []a = w[i].toCharArray();
            max = Integer.MIN_VALUE;
            min = Integer.MAX_VALUE;
            for(int j = 0; j < a.length; j++){
                if (a[j] > max){max  = a[j];}
                if (a[j] < min){min = a[j];}
            }
            System.out.println(w[i]+" :\nMinimum ASCII: "+(char)min+"\nMaximum ASCII: "+(char)max+"\n");
        }
    }
}
