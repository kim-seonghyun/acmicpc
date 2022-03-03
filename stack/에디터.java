import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
	static class DIYStack{
		char[] array = new char[600001];
		int top =-1;
		void push(char ch){
			top++;
			array[top] = ch;
		}
		char pop(){
			if(top >=0){
				char tmp = array[top];
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
		DIYStack left = new DIYStack();
		DIYStack right = new DIYStack();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		for(int i=0; i<str.length(); i++){
			left.push(str.charAt(i));
		}
		int M = Integer.parseInt(br.readLine());
		String instruction;
		char instructionSpelling;
		for(int i=0; i<M; i++){
			instruction = br.readLine();
			instructionSpelling = instruction.charAt(0);
			if(instructionSpelling == 'P'){
				left.push(instruction.charAt(2));
			}else if(instructionSpelling == 'L'){
				if(left.isEmpty()){
					continue;
				}
				right.push(left.pop());
			}else if(instructionSpelling == 'D'){
				if(right.isEmpty()){
					continue;
				}
				left.push(right.pop());
				
			}else{
				if(left.isEmpty()){
					continue;
				}
				left.pop();
			}
		}

		while(!left.isEmpty()){
			right.push(left.pop());
		}
		StringBuilder sb = new StringBuilder();
		while(!right.isEmpty()){
			sb.append(right.pop());
		}
		System.out.println(sb);
	} 
}
	