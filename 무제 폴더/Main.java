import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
	static class DIYStack{
		String[] stackArray = new String[21];
		int topIndex =-1;
		void push(String str){
			stackArray[++topIndex] = str;
		}

		String pop(){
			if(topIndex <0) return "-1";
			String a = stackArray[topIndex];
			stackArray[topIndex] = "\0";
			topIndex--;
			return a;
		}

		int size(){
			return topIndex +1;
		}

		boolean empty(){
			if(topIndex < 0) return true;
			return false;
		}
		int top(){
			if(topIndex < 0) return -1;
			return topIndex;
		}

	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str;
		StringBuilder sb = new StringBuilder();
		DIYStack stack = new DIYStack();
		for(int i=0; i<N; i++){
			str = br.readLine() + "\n";
			for(int j=0; j<str.length(); j++){
				if(Character.compare(str.charAt(j), ' ') ==0 || Character.compare(str.charAt(j) ,'\n') == 0){
					while(!stack.empty()){
						sb.append(stack.pop());
					}
					sb.append(" ");
				}else{
					stack.push(String.valueOf(str.charAt(j)));
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
		
	}
}