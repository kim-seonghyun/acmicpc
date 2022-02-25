import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class 최대값 {
	public static void main(String[]args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int MAX = Integer.MIN_VALUE;
		int MIN = Integer.MAX_VALUE;
		int[] array = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++){
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		int indexValue;
		for(int i=0; i<N; i++){
			indexValue = array[i];
			if(MAX < indexValue){
				MAX = indexValue;
			}
			if(MIN > indexValue){
				MIN = indexValue;
			}
		}
		System.out.println(MIN + " " + MAX);
		
		
	}

}