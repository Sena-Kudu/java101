import java.util.Scanner;  

public class MyClass {
    
        public static Boolean bolunurmu(int deger){
        
            if(deger%12 == 0)
                return true;
            else
                return false;
   
        }
    
    public static void main(String args[]) {
    
      Scanner scanner = new Scanner(System.in);
      int sayi = scanner.nextInt();
      int toplam = 0;
      int sayac = 0;
      double sonuc = 0;
     
      for(int i=0; i<=sayi; i++){
          
        if(i==0)
            continue;
        if(bolunurmu(i)){
            toplam+=i;
            sayac++;
            
        }
         
      }
      
      sonuc = toplam/sayac;
      System.out.println(sonuc);
     
    }
}