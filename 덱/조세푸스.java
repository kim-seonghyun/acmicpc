import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<Integer>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        StringBuilder josephus = new StringBuilder("<");
        for(int i=1; i<=N; i++){
            q.add(i);
        }

        for(int i=0; i<N; i++){
            for(int j=1; j<K; j++){
                q.add(q.remove());
            }
            josephus.append(q.remove()).append(", ");
        }
        josephus.delete(josephus.length()-2, josephus.length()).append(">");
        
        System.out.println(josephus);
    }
}
