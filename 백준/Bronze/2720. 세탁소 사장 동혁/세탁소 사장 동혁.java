import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = Integer.parseInt(br.readLine());
        for (int i = 0; i < caseNum; i++) {
            int priceCent = Integer.parseInt((br.readLine()));
            int[] arr = {0, 0, 0, 0};
                arr[0] = priceCent / 25;
                priceCent -= arr[0]*25;

                arr[1] = priceCent / 10;
                priceCent -= arr[1]*10;

                arr[2] = priceCent / 5;
                priceCent -= arr[2]*5;

                arr[3] = priceCent;

                for(int j = 0; j < 4 ; j++){
                    System.out.print(arr[j]+" ");
                }
            System.out.println();

    }
}}