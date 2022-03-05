import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;
import java.util.StringTokenizer;



public class 알파벳개수 {
	public static void main(String[]args) throws IOException {
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] arr = new String[str.length()];
		for(int i=0; i<str.length(); i++){
			arr[i] = str.substring(i); // 다 넣었어
			
		}
		Arrays.sort(arr);
		for(int i=0; i<str.length(); i++){
			System.out.println(arr[i]);
		}
	}
}