import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 단어뒤집기2 {
    public static void main(String args[]) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          String line = "";
       StringBuilder sb = new StringBuilder();
     
       while((line = br.readLine()) != null){
        int[] arr = new int[4];
        for(int i=0; i<line.length(); i++){
            char c = line.charAt(i);
            if(c - 'a' >= 0 && c - 'a' <= 25){
                arr[0]++;
            }else if(c - 'A' >= 0 && c - 'A' <= 25){
                arr[1]++;
            }else if(c - '0' >= 0 && c - '0' <= 9){
                arr[2]++;
            }else {
                arr[3]++;
            }
        }
        // sb.append(lowerCase).append(' ').append(upperCase).append(' ').append(number).append(' ').append(space);
        // sb.append("\n");
        // System.out.println(lowerCase + " " + upperCase + " " + number + " " + space);
        for(int j=0; j<arr.length; j++){
            sb.append(arr[j]).append(" ");
        }
        sb.append('\n');
       }
   System.out.println(sb);
    }
}
