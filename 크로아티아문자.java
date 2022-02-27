import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int count =0;
        for(int i=str.length()-1; i>=0; i--){
            if(i == 0){
                count++;
                break;
            }
            int current = str.charAt(i);
            if(current == '='){
                count++;
                if((i-2) >= 0 && str.charAt(i-1) == 'z' && str.charAt(i-2) == 'd'){
                    i-=2;
                    continue;
                }
                i--;
            }else if(current == '-'){
                count++;
                i--;
            }else if(current == 'j'){
                if(str.charAt(i-1) == 'l' || str.charAt(i-1) == 'n'){
                    count++;
                    i--;
                }else{
                    count++;
                }
            }else{
                count++;
            }
            
        }
        System.out.println(count);
    }
}
