import java.util.Scanner; 
public class myClass{

     public static void main(String []args){
        int sayi,toplam=0;
        
      Scanner scanner = new Scanner(System.in);
      
      for(int i=0; ; i++){
          
        sayi = scanner.nextInt();
        
        if(sayi%2==1)
            break;
        if(sayi%4 == 0)
            toplam+=sayi;
      }

      System.out.println(toplam);
     }
}