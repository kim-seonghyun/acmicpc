import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class 숫자의개수 {
	public static void main(String[]args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());

		int multiplyResult = A*B*C; // v

		int[] resultArray = {0,0,0,0,0,0,0,0,0,0};
		while(multiplyResult != 0){
			resultArray[multiplyResult%10]++;
			multiplyResult /= 10;
		}

		for(int i=0; i<10; i++){
			System.out.println(resultArray[i]);
		}
	}

}
