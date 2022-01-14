import java.util.Scanner; 
public class SpinWords {

  public static String spinWords(String sentence) {

        String nstr = "";
      
        char ch;
        
        String[] arrSplit = sentence.split("\\s");
        int length = arrSplit.length;
         for (int i=0;i<length;i++) {
    
           if(arrSplit[i].length() >= 5){
                
               for (int j=0; j<arrSplit[i].length(); j++)
                {
                  ch= arrSplit[i].charAt(j); 
                  nstr= ch+nstr; 
                 
                }
                arrSplit[i] = nstr;
                nstr = "";
           }
         }
         String sonuc= "";
        for(int k=0; k<arrSplit.length;k++){
            System.out.print(arrSplit[k]+ " ");

          if(k!=arrSplit.length-1){
            sonuc+=arrSplit[k]+" ";
          }else{
            sonuc+=arrSplit[k];
          }
        }
    return sonuc;

  }
  
    public static void main(String args[]) {
     
     Scanner scanner = new Scanner(System.in);
     String sentence = scanner.nextLine();
     spinWords(sentence);
    
    }
    
}