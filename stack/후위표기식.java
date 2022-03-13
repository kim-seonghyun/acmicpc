import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
   public static int returnPriority (char ch){
      if(ch == '(') return 0;
      if (ch=='+' || ch=='-') return 1;
      return 2;
   }
   public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
      StringBuilder sb = new StringBuilder();
      Stack<Character> operaterStack = new Stack<>();

      

        for(int i=0; i<str.length(); i++){
           char ch = str.charAt(i);

           if(ch - 'A' >= 0 && ch -'A' <=25){// 피연산자인 경우
            sb.append(ch);
           }else{ //연산자의 경우
            if(ch == '('){ 
               operaterStack.push('(');
            }else if(ch == ')'){ 
               while(!operaterStack.isEmpty() && operaterStack.peek() != '('){
                  sb.append(operaterStack.pop());
               }
               operaterStack.pop();
            }else{
               while(!operaterStack.isEmpty() && returnPriority(operaterStack.peek()) >= returnPriority(ch) ){
                  sb.append(operaterStack.pop());
               }
               operaterStack.push(ch);
            }
           }
        }

        while(!operaterStack.isEmpty()){
           sb.append(operaterStack.pop());
        }
        System.out.println(sb);
   }
}
