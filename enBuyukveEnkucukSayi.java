import java.util.Scanner;  

public class MyClass {

    
    public static void main(String args[]) {
    
      Scanner scanner = new Scanner(System.in);
      int kacsayi = scanner.nextInt();
 
      
      if(kacsayi>1){
        int sayi = scanner.nextInt();
        int max=sayi;
        int min=sayi;
     
     
      for(int i=1; i<kacsayi; i++){
          
        sayi = scanner.nextInt();
     
        if(max<sayi){
            max=sayi;
        }
        if(min>sayi)
            min=sayi;
        
      }

      System.out.println("en buyuk sayi: "+max+" en kucuk sayi: "+min);
      
      }
     
    }
}