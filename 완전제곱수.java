import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class 완전제곱수 {
	public static void main(String[]args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int first = -1;
		boolean isChecked = false;
		int sum =0;
		for(int i = M; i<=N; i++){
			double tmp = Math.sqrt(i);
			double tmp1 = Math.ceil(tmp);
			if(tmp == tmp1){
				if(!isChecked){
					isChecked = true;
					first = i;
				}
				sum +=i;
			}
		}
		if(isChecked){
			System.out.println(sum);
			System.out.println(first);
			return;
		}
		System.out.println(-1);
	}
}