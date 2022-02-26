import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;



public class Main {

	static boolean isHanNumber(int i){
		if(i < 100){
			return true;
		}else{
			int oneDigit = i%10;
			i /= 10;
			int tenDigit = i%10;
			i /= 10;
			int hundredDigit = i%10;
			i /=10;
			if((hundredDigit - tenDigit) == ( tenDigit - oneDigit)){
				return true;
			}else{
				return false;
			}
		}

	}
	public static void main(String[]args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] arr = new boolean[1001];
		for(int i=0; i<arr.length; i++){
			arr[i] = false;
		}
		
		for(int i=1; i<=999; i++){
			arr[i] = isHanNumber(i);
		}
		arr[1000] = false; 
		int count =0;
		int n = Integer.parseInt(br.readLine());
		for(int i = 1; i<=n; i++){
			if(arr[i] == true){
				count++;
			}
		}
		System.out.println(count);
	}

}