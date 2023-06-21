public class Palindrome {
    public static void main(String args[]) {
      int vow = 0, con = 0;
       String myString = "madam";
       StringBuffer buffer = new StringBuffer(myString);
       buffer.reverse();
       String data = buffer.toString();
       if(myString.equals(data)){
          System.out.println("Given String is palindrome");
          System.out.println("Total Number of Letters: "+myString.length());
          System.out.print("Letters Separated by comma: ");
          String temp = "";
          for(int i = 0; i < myString.length(); i++){
            System.out.print(i < myString.length()-1 ? temp += myString.charAt(i)+", " : myString.charAt(i));
          }
       } else {
          System.out.println("Given String is not palindrome");
          for(int i = 0; i < myString.length(); i++) {       
            if(myString.charAt(i) == 'a' || myString.charAt(i) == 'e' || myString.charAt(i) == 'i' || myString.charAt(i) == 'o' || myString.charAt(i) == 'u' || myString.charAt(i) == 'A' || myString.charAt(i) == 'E' || myString.charAt(i) == 'I' || myString.charAt(i) == 'O' || myString.charAt(i) == 'U') {   
                vow++;    
            }    
            
            else if((myString.charAt(i) >= 'a' && myString.charAt(i)<='z') || (myString.charAt(i) >= 'A' && myString.charAt(i)<='Z')) {      
                con++;    
            }    
        }    

        System.out.println("Vowels: "+vow+"\nConsonants: "+con);
       }
    }
 }