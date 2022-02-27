import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException{
       BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
       int N = Integer.parseInt(br.readLine());
       
       String s;
       int count = 0;
       for(int i=0; i<N; i++){
        boolean[] isChecked = new boolean[26];
        for(int q=0; q<isChecked.length; q++){
            isChecked[q] = false;
        }
           s = br.readLine();
           char c;
           count++;
           for(int j=0; j<s.length(); j++){
                c = s.charAt(j);
                if(isChecked[c - 'a']){
                    count--;
                    break;
                }else{
                    isChecked[c - 'a'] = true;
                }
                while(j < s.length() -1){
                    if(s.charAt(j) == s.charAt(j+1)){
                        j++;
                    }else{
                        break;
                    }
                }
           }
       }
       System.out.println(count);
    }
}
