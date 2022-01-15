public class MyClass {
    
    public static boolean isFind(int [] arr,int value){
        for(int i : arr){
            if(i == value)
                return true;
        }
        
        return false;
    }
    
    public static void main(String args[]) {
    
      int [] arr = {2,2,8,8,8,9,17,9,22,22,22,17};
      int [] duplicate = new int [arr.length];
      int start = 0;
        
      for(int i=0 ; i<arr.length; i++){
          for(int j=0; j<arr.length; j++){
              if((i!=j) && (arr[i] == arr[j]) && (arr[i]%2 == 0)){
                  if(!isFind(duplicate,arr[i]))
                    duplicate[start++] = arr[i];
              }
          }
           
      }
      
      for(int k : duplicate){
          if(k != 0)
            System.out.println(k);
      }
      
      
      
    }
     
}