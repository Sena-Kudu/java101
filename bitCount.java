import java.util.*;
public class BitCounting {

//Verilen sayinin binary olarak kac tane 1'e sahip oldugunu sayar
  public static int countBits(int n){
    int sayac = 0;
    
    while(n != 0){
      
     if(n%2 == 1) 
       sayac++;
      n = n/2;     
      
    }
    return sayac;
  }
  
    public static void main(String args[]) {
     
     Scanner scanner = new Scanner(System.in);
     int sayi = scanner.nextInt();
            
     System.out.println(countBits(sayi));
    
    }
  
}