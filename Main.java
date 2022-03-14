import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static int count = 0;
    public static int[] arr = new int[1001];
//    public static int recursive(int i){
//        if(i <= 1){
//            count++;
//            return i;
//        }else{
//            if(arr[i] > 0) {
//                return arr[i];
//            }
//            return arr[i] = recursive(i-1) + recursive(i-2);
//        }
//
//
//    }
    public static void main(String args[]) throws IOException {
        long[] dp = new long[1001];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 3;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=3; i<=N; i++){
            dp[i]= (dp[i-1] + dp[i-2] + dp[i-2])%10007;
        }
        System.out.println(dp[N]);
    }
}
