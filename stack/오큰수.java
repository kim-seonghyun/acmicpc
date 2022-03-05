import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;



public class Main {
	public static void main(String[]args) throws IOException {
		Stack<Integer> soloIndicesStack = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		soloIndicesStack.push(0);
		int[] NGE = new int[1000001];

		int[] numberArray = new int[1000001];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k=0;
		while(st.hasMoreTokens()){
			numberArray[k] = Integer.parseInt(st.nextToken());
			k++;
		}
		int number;
		for(int i=1; i<N; i++){ //인덱스 순회
			number = numberArray[i];
			if(numberArray[soloIndicesStack.peek()] >= number){ //오큰수를 못찾음
				soloIndicesStack.push(i);
			}else{ //오큰수를 찾음.
				while(!soloIndicesStack.isEmpty()&&numberArray[soloIndicesStack.peek()] < number){
					NGE[soloIndicesStack.pop()] = number;
				}
				soloIndicesStack.push(i);
			}
		}

		while(!soloIndicesStack.isEmpty()){ //오큰수 없는 애들 -1
			NGE[soloIndicesStack.pop()] = -1;
		}
		StringBuilder sb= new StringBuilder();
		for(int i=0; i<N; i++){
			sb.append(NGE[i]).append(" ");
		}
		System.out.println(sb);
	}
}