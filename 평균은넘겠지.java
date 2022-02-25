import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 평균은넘겠지 {
	public static void (String[]args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i=0; i<C; i++){
			st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			double sum =0;
			int[] array = new int[N];
			for(int j = 0; j< N; j++){
				array[j] = Integer.parseInt(st.nextToken());
				sum += array[j];
			}
			double average = sum / N;
			double overAverageStudents = 0;
			for(int j =0; j<N; j++){
				if(array[j] > average){
					overAverageStudents++;
				}
			}
			System.out.println(String.format("%.3f",overAverageStudents/N*100) + "%");
		}

		
		
	}
}
