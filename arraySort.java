import java.util.*;

public class MyClass {
    
    public static void main(String args[]) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizinin boyutu n :");
        int sayi = scanner.nextInt();
        int num;
        int [] arr = new int[sayi];
        
        System.out.println("Dizinin boyutu n :");
         for(int i=0; i<sayi; i++){
             System.out.println(i+". Elemanı :");
             num = scanner.nextInt();
             arr[i] = num; 
             
         }
         
         Arrays.sort(arr);
         
       
         System.out.println(Arrays.toString(arr));
      
    }
     
}