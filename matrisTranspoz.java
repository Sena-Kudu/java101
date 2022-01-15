import java.util.*;

public class MyClass {
    
    public static void main(String args[]) {
    
        int [][] arr = new int[3][4];
        int [][] transpoz = new int[arr[0].length][arr.length];
        int num = 0;
        
         for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = num++;
            }
             
         }
         
         for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println(" ");
             
         }
         
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                transpoz[j][i] = arr[i][j];

            }
      
         }
         
         System.out.println("--------------------------------");
         
        for(int i=0; i<transpoz.length; i++){
            for(int j=0; j<transpoz[0].length; j++){
             
                System.out.print(transpoz[i][j]+ " ");
            }
            System.out.println(" ");
             
         }
      
    }
     
}