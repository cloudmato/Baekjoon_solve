import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int[] sort(int[] arr){
        l_pivot_sort(arr,0,arr.length -1);
        return arr;
    }

    private static void l_pivot_sort(int[] arr, int lo, int hi){
        if(lo>=hi){
            return;
        }

        int pivot = partition(arr,lo,hi);

        l_pivot_sort(arr,lo,pivot-1);
        l_pivot_sort(arr,pivot+1,hi);
    }

    private static int partition(int[] arr, int left, int right){

        int lo = left;
        int hi = right;
        int pivot = arr[left];  //부분 리스트의 왼쪽 요소를 피벗으로 설정.

        //lo가 hi보다 작을 때 까지만 반복한다.
        while (lo<hi){

            while (arr[hi] > pivot && lo < hi) {
                hi--;
            }

            while (arr[lo]<=pivot && lo<hi){
                lo++;
            }

            swap(arr,lo,hi);
        }

        swap(arr, left, lo);
        return lo;
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i]=Integer.parseInt(br.readLine());
            sum+=arr[i];
        }
        System.out.println(sum/5);  //평균값 출력

        sort(arr);
        int value = arr[2];
        System.out.println(value);
    }
}