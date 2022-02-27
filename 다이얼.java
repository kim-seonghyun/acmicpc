import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 다이얼 {
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] number = {2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
        String str = br.readLine();
        int sum =0;
        for(int i=0; i<str.length(); i++){
            sum += number[str.charAt(i) - 'A'] +1;
        }
        System.out.println(sum);
       
    }
}

