import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static class Deque{
        
        int[] dequeArray = new int[20001];
        int s = 10000;
        int e = 10000;
        int size =0;

        void push_front(int X){
                dequeArray[s] = X;
                s--;
                size++;
        }

        void push_back(int X){
                dequeArray[++e] = X;
                size++;
        }

        int pop_front(){
            if(empty() == 1) return -1;
            size--;
            return dequeArray[++s];
            
        }

        int pop_back(){
            if(empty()==1) return -1;
            size--;
            return dequeArray[e--];
        }
        int size(){
            return size;
        }
        int empty(){
            if(size==0) return 1;
            return 0;
        }
        int front(){
            if(empty() == 1) return -1;
            return dequeArray[s+1];
        }
        int back(){
            if(empty() == 1) return -1;
            return dequeArray[e];
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque customDeque = new Deque();
        String order = "";
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            order = st.nextToken();
            switch(order){
                case "push_front":
                    customDeque.push_front(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    customDeque.push_back(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    sb.append(customDeque.pop_front()).append("\n");
                    break;
                case "pop_back":
                    sb.append(customDeque.pop_back()).append("\n");
                    break;
                case "size":
                    sb.append(customDeque.size()).append("\n");
                    break;
                case "empty":
                    sb.append(customDeque.empty()).append("\n");
                    break;
                case "front":
                    sb.append(customDeque.front()).append("\n");
                    break;
                case "back":
                    sb.append(customDeque.back()).append("\n");
                    break;
            }
            
        }
        System.out.print(sb);
    }
}
