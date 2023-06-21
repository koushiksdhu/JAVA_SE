public class StringWordSort {
    public static void main(String args[]){
        String s = "asansol engineering college";
        String s1 = "";
        String words [] = s.split(" ");
        
        for(int i = 0; i < words.length; i++){
            for(int j = 'a'; j <= 'z'; j++){
                for(int k = 0;  k < words[i].length(); k++){
                     if(words[i].charAt(k) == j){
                        s1 += words[i].charAt(k);
            }
        }
        }
        s1 +=" ";
    }
        System.out.println(s1);
    
    }
}
