import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine()," ");

        for(int i=0; i<N; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int temp = 0;
        for(int i=0; i<N-1; i++){
            for(int j=i+1; j<N; j++){
                if(arr[i]<arr[j]){
                    temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }

        System.out.println(arr[K-1]);;
    }
}
