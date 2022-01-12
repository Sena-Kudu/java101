import java.util.Scanner; 
public class myClass{

     public static void main(String []args){
        int sayi=0;
        double dort,bes=0.0;
        
      Scanner scanner = new Scanner(System.in);
      sayi = scanner.nextInt();
      
      for(int i=0; ; i++){
        
        dort = Math.pow(4,i);
        bes = Math.pow(5,i);
        
        if(dort <= sayi)
            System.out.println("4'un "+ i+ ". kuvveti: " +dort);
        
        if(bes <= sayi)
            System.out.println("5'in "+ i+ ". kuvveti: " +bes);
        
        if(dort > sayi && bes > sayi)
            break;
        
      }
 
     }
}