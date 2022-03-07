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


public class 소수찾기 {

	public static void main(String[]args) throws IOException {
		boolean[] primes = new boolean[1001];
		primes[0] = false;
		primes[1] = false;
		for(int i=2; i<primes.length; i++){
			primes[i] = true;
		}
	

		for(int i=2; i<primes.length; i++){
			for(int j=2; j*i<primes.length; j++){
				primes[i * j] = false;
			}
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count =0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++){
			if(primes[Integer.parseInt(st.nextToken())] == true){
				count++;
			}
		}
		System.out.println(count);

	}
}