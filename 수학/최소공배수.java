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


public class 최소공배수 {

	static int GCD(int A, int B){
		while(true){
			int r = A% B;
			A = B;
			B =r;
			if(B==0){
				return A;
			}
		}
	}
	public static void main(String[]args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());

		for(int i=0; i<N; i++){
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int GCD = GCD(A,B);
			System.out.println(A*B/GCD);
		}
	}
}