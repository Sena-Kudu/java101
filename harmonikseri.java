import java.util.*;

public class MyClass {

  
    public static void main(String args[]) {
     
     Scanner scanner = new Scanner(System.in);
     int sayi = scanner.nextInt();
     double toplam = 0.0;
     
     for(double i=1; i<=sayi; i++){
         
         toplam+=1.0/i;
         
     }
            
    System.out.println(toplam);

    
    }
}