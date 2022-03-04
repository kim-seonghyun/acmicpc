import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 단어뒤집기2 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine() + "\n";
        char c;
        Stack<Character> st = new Stack<Character>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            c = s.charAt(i);
            
            if(c == '<'){
                if(!st.isEmpty()){
                    while(!st.isEmpty()){
                        sb.append(st.pop());
                    }
                }
                while(s.charAt(i) != '>'){
                    sb.append(s.charAt(i));
                    i++;
                }
                sb.append(s.charAt(i)); // >삽입.
            }else if(((c -'a')>= 0 && (c-'a') <= 25) || ((c-'0') >= 0) && (c-'0') <= 9){
                st.push(c);
            }else if(c == ' ' || c == '\n'){
                while(!st.isEmpty()){
                    sb.append(st.pop());
                }
                sb.append(c);
            }
            
        }
        System.out.println(sb);
    }
}
