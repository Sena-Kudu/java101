import java.util.*;

public class MyClass {
    
    public static boolean isPalindrom(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            
            if(str.charAt(i) != str.charAt(j))
                return false;
                
            i++;
            j--;
            
        }
        
        return true;
        
    }
    
    public static void main(String args[]) {
    
    String palindrom = "kelek";
    if(isPalindrom(palindrom))
      System.out.println("palindrom kelimedir.");
     else
        System.out.println("palindrom kelime değildir..");
    }
     
}