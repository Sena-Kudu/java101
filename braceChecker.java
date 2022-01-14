import java.util.Stack;
public class BraceChecker {

  public static boolean isValid(String braces) {
    
    if(braces.isEmpty()){
      return true;
    }
    
    Stack<Character> stack = new Stack<Character>();
    for(int i=0; i<braces.length(); i++){
      char current = braces.charAt(i);
      
      if(current == '{' || current == '(' || current == '['){
        stack.push(current);
      }
      
      if(current == '}' || current == ')' || current == ']'){
        
        if(stack.isEmpty())
          return false;
        
        char last = stack.peek();
        
        if(current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
          stack.pop();
        else
          return false;
      }
      
    }
    return stack.isEmpty();
  }

   public static void main(String args[]) {
      
      System.out.println(isValid("(){}[)"));
    
    }

}