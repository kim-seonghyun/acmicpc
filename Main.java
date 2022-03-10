import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.function.DoubleBinaryOperator;


public class Main {

	public static void main(String[]args) throws IOException {
		int n;
		int r;
		int nMinusR;

		long twoCounter = 0;
		long fiveCounter =0;
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		nMinusR = n-r;


		for(long i=2; i<=n; i*=2){
			twoCounter += n/i;
			twoCounter -= r/i;
			twoCounter -= nMinusR/i;
		}
		for(long i=5; i<=n; i*=5){
			fiveCounter += n/i;
			fiveCounter -= r/i;
			fiveCounter -= nMinusR/i;
		}
		if(twoCounter> fiveCounter){
			System.out.println(fiveCounter);
		}else{
			System.out.println(twoCounter);
		}
		// int i = 2;

		// while(i<=n){
		// 	twoCounter += n/i;
		// 	i*=i;
		// }

		// i=2;
		// while(i<=r){
		// 	twoCounter -= r/i;
		// 	i*=i;
		// }

		// i=2;
		// while(i<=nMinusR){
		// 	twoCounter -= nMinusR/i;
		// 	i*=i;
		// }
		

		// //2^n이 N보다 작은동안
		// i = 5;

		// while(i<=n){
		// 	fiveCounter += n/i;
		// 	i*=i;
		// }

		// i=5;
		// while(i<=r){
		// 	fiveCounter -= r/i;
		// 	i*=i;
		// }

		// i=5;
		// while(i<=nMinusR){
		// 	fiveCounter -= nMinusR/i;
		// 	i*=i;
		// }
		// System.out.println(twoCounter);
		// System.out.println(fiveCounter);


		// int i =2;


		// //2^n이 N보다 작을때
		// while(i<=n){ 
		// 	twoCounter += n/i;
		// 	twoCounter -= r/i;
		// 	twoCounter -= nMinusR/i;
		// 	i = i*i;
		// }

		// i = 5;
		// //5^n이 N보다 작을때
		// while(i<=n){ 
		// 	fiveCounter += n/i;
		// 	fiveCounter -= r/i;
		// 	fiveCounter -= nMinusR/i;
		// 	i = i*i;
		// }

		// if(twoCounter < fiveCounter){
		// 	System.out.println(twoCounter);
		// }else{
		// 	System.out.println(fiveCounter);
		// }
	}
}