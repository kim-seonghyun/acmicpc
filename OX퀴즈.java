import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OX퀴즈 {
	public static void main(String[]args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String OXString;
		int valueO = 0;
		int sum;
		for(int i=0; i<N; i++){
			OXString = br.readLine();
			sum =0;
			for(int j =0; j<OXString.length(); j++){
				if(OXString.charAt(j) == 'O'){
					valueO++;
					sum+= valueO;
				}else{
					valueO = 0;
				}
			}
			System.out.println(sum);
			valueO =0;
		}
	}
}
