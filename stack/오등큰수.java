import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;



public class Main {
	public static void main(String[]args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] FA = new int[1000001];
		int[] A = new int[1000001];

		StringTokenizer st = new StringTokenizer(br.readLine());
		int k =1;

		Stack<Integer> soloIndicies = new Stack<Integer>();
		while(st.hasMoreTokens()){ //배열 A 채우기
			A[k] = Integer.parseInt(st.nextToken());
			FA[k] = 0;
			k++;
			
		}

		for(int i=1; i<=N; i++){
			FA[A[i]]++;
		}
		
		soloIndicies.push(1);
		int[] NGF = new int[1000001];
		for(int i=2; i<=N; i++){
			if(FA[A[i]] < FA[A[soloIndicies.peek()]]){
				soloIndicies.push(i);
			}else{ //오등큰수 v	
				while(!soloIndicies.isEmpty() && FA[A[i]] > FA[A[soloIndicies.peek()]]){ //오등큰수 전까지 pop완료
					NGF[soloIndicies.pop()] = A[i];
				}
				soloIndicies.push(i);
			}
		}
		while(!soloIndicies.isEmpty()){
			NGF[soloIndicies.pop()] = -1;
		}

		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=N; i++){
			sb.append(NGF[i]).append(" ");
		}
		System.out.println(sb);
	}
}