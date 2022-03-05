import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;



public class 오등큰수 {
	public static void main(String[]args) throws IOException {
		int[] alphabet = new int[26];

		for(int i=0; i<alphabet.length; i++){
			alphabet[i] =0;
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		for(int i=0; i<str.length(); i++){
			alphabet[str.charAt(i) - 'a']++;
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<alphabet.length; i++){
			sb.append(alphabet[i]).append(" ");
		}
		System.out.println(sb);
	}
}