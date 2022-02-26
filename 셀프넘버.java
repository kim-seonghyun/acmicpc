public class 셀프넘버 {

        static int d(int n){
            int sum = n;
            while(n!=0){
                sum += n%10;
                n /= 10;
            }
            return sum;
        }
        public static void main(String[] args){
            int[] arr = new int[10003];
            for(int i=0; i<arr.length; i++ ){
                arr[i] = 0;
            }

            for(int i=1; i<10000; i++){
                int n = d(i);
                if(n <= 10000){
                    arr[n]++;
                }
                
            }

            for(int i=1; i<=10000; i++){
                if(arr[i] == 0){
                    System.out.println(i);
                }
            }
        }
   
}
