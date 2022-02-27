import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 단어의개수{
    public static void main(String[] args) throws NumberFormatException, IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int N = Integer.parseInt(br.readLine());
        String st;
        int count =0;
       for(int i=0; i<N; i++){
           boolean[] alphabetArray = new boolean[26];
           st = br.readLine();
           char old = st.charAt(0);
           alphabetArray[old - 'a'] = true;
           boolean isGroupCheck = true;
           
           for(int j = 0; j<st.length(); j++){
                char now = st.charAt(j);
                if(alphabetArray[now - 'a'] == false && old != now){
                    alphabetArray[now -'a'] = true;
                    
                }else if(alphabetArray[now -'a'] == true && old != now){
                    isGroupCheck = false;
                    break;
                }
                old = now;
           }
           if(isGroupCheck){
            count++;
           }
       }
       System.out.println(count);
    }
}

