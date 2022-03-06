import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.function.DoubleBinaryOperator;


public class 후위표기식2 {
	public static void main(String[]args) throws IOException {
		
        

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double operand[] = new double[N];


        String fomula = br.readLine();

        Stack<Double> stack = new Stack<>();
        for(int i=0; i<N; i++){
            operand[i] = Integer.parseInt(br.readLine());
        }

        char c;
        for (int i=0; i<fomula.length(); i++){
            c= fomula.charAt(i);
            
            if(c == '*' || c == '+' || c == '-' || c == '/'){
                double B = stack.pop();
                double A = stack.pop();

                switch(c){
                    case '*':stack.push(A*B);
                        break;
                    case '/': stack.push(A/B);
                        break;
                    case '+': stack.push(A+B);
                        break;
                    case '-': stack.push(A-B);
                        break;
                }
            }else if( (c - 'A' >=0) && (c - 'A' <= 25)){
                stack.push(operand[c-'A']);
            }
        }
        System.out.println(String.format("%.2f" , stack.pop()));



	}
}