import java.util.Scanner; 
import java.util.Arrays;

public class MyClass {

    
    public static void main(String args[]) {
    
      Scanner scanner = new Scanner(System.in);
      int sayi = scanner.nextInt();
      
      
     
      int [] arr = {-1,546,76,21,19,15,-19};
      
       Arrays.sort(arr); 
       
       while(sayi<arr[0] || sayi>arr[arr.length-1]){
           System.out.println("Girdiğiniz sayi ilgili aralıkta değildir lütfen yeni sayi giriniz: ");
           sayi = scanner.nextInt();
       }
       

      for(int i=0 ; i<arr.length; i++){

        if(sayi<arr[i]){
             int enyakin=arr[i];
      System.out.println("Girilen sayıdan büyük en yakın sayı: "+enyakin);
             break;
        }
           
      }
      
        for(int j=arr.length-1 ; j>=0; j--){

        if(sayi>arr[j]){
             int enyakinkucuk=arr[j];
      System.out.println("Girilen sayıdan küçük en yakın sayı: "+enyakinkucuk);
             break;
        }
           
      }
           
      
    }
     
}