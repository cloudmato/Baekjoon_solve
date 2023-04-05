import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];

        for(int i=0; i<num; i++){
            arr[i]=Integer.parseInt(br.readLine());
        }

        insertion_sort(arr, num);
        for(int i=0;i<num;i++){
            System.out.println(arr[i]);
        }
    }

    private static void insertion_sort(int[] arr, int num){
        int key;
        for(int i=1; i<num; i++){
            key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]= arr[j];
                arr[j]=key;
                j--;
            }
        }
    }
}