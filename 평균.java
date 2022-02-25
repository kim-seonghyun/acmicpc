import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[]args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		double[] array = new double[N];
		double MAX = Double.MIN_VALUE;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int tmp;
		for(int i=0; i<N; i++){
			tmp = Integer.parseInt(st.nextToken());
			array[i] = tmp;
			if(tmp > MAX){
				MAX = tmp;
			}
		}
		double sum =0;
		for(int i=0; i<N; i++){
			sum += (array[i] / MAX * 100);
		}
		System.out.println(sum/N);
	}
}
