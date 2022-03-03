import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class 스택수열{
	static class DIYStack{
		int[] array = new int[100001];
		int top =-1;
		void push(int ch){
			top++;
			array[top] = ch;
		}
		int pop(){
			if(top >=0){
				int tmp = array[top];
				array[top] = ' ';
				top--;
				return tmp;
			}
			return 0;
		}
		boolean isEmpty(){
			if(top == -1){
				return true;			}
			return false;
		}
		int top(){
			return array[top];
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		DIYStack stack = new DIYStack();
		int sequenceValue = 1;
		int pickValue = 0;
		for(int i=0; i<N; i++){
			pickValue = Integer.parseInt(br.readLine());
			while(pickValue >= sequenceValue){
				stack.push(sequenceValue);
				sequenceValue++;
				sb.append("+").append("\n");
			}
			if(pickValue == stack.top()){
				stack.pop();
				sb.append("-").append("\n");
			}else{
				System.out.println("NO");
				return;
			}
		}
		System.out.println(sb);
	} 
}
	