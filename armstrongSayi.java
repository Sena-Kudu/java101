import java.util.Scanner;  
import java.util.ArrayList;

public class MyClass {
    
        public static ArrayList<Integer> basamak(int sayi){
            int basamak = 0;

            ArrayList<Integer> numbers = new ArrayList<Integer>();
        
            while(sayi != 0){
                basamak = sayi%10;
                sayi= sayi/10;
                numbers.add(basamak);
                
            }
           return numbers;
   
        }
    
    public static void main(String args[]) {
    
      Scanner scanner = new Scanner(System.in);
      int sayi = scanner.nextInt();
      int toplam = 0;
      double kuvvet = 0.0;
    //1634 armstrong sayidir
    
      for(int i=0; ; i++){
          toplam = 0;
          kuvvet = 0.0;
          for (int v: basamak(sayi)){
              kuvvet = Math.pow(v,i);
              toplam+=kuvvet;
              
          }
          
          
          if(sayi == toplam){
            System.out.println(sayi+ " armstrong sayidir.");
            break;
          }
          
          if(toplam > sayi){
              System.out.println(sayi+ " armstrong sayi değildir.");
              break;
          }
          
      }
     
    }
}