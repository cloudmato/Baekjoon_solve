import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[][] arr = new int[num][2];

        StringTokenizer st;

        for(int i = 0; i < num ; i++){
            String s = br.readLine();
            st = new StringTokenizer(s," ");

            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr,(a,b) -> a[0] == b[0] ? (a[1] - b[1]) : (a[0] - b[0]));

        for(int i = 0; i < num; i++){
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}