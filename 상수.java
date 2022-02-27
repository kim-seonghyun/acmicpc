import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int[] A = new int[3];
       int[] B = new int[3];


       for(int i=0; i<A.length; i++){
           A[i] = br.read() - '0';
       }
       br.read();
       for(int i=0; i<B.length; i++){
           B[i] = br.read() -'0';
       }

       int newA = A[0] + A[1] *10 + A[2] * 100;
       int newB = B[0] + B[1] *10 + B[2] *100;

       if(newA > newB){
           System.out.println(newA);
       }else{
           System.out.println(newB);
       }
    }
}
