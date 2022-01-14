import java.util.Scanner;  

public class MyClass {
    
        public static double combination(int n,int r){
            int ust = 1;
            int alt=1;
            double sonuc = 0.0;
            int dongu = n-r;
           
           for(int i=n; i>dongu; i--){
               
               ust*= i;
               alt*=r;
               r--;
              
           }
           
           sonuc = ust/alt;
           return sonuc;
   
        }
    
    public static void main(String args[]) {
    
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      int r =scanner.nextInt();
      System.out.println(combination(n,r));
     
    }
}