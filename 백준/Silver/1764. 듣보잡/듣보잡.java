import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int noHear = Integer.parseInt(st.nextToken());
        int noWatch = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> sH = new HashMap<>();
        String s = "";

        for(int i = 0; i < (noHear + noWatch); i++) {
            s = br.readLine();
                sH.put(s, sH.getOrDefault(s,0) + 1);
        }




        int count = 0;
        Stack<String> stack = new Stack<>();

        for (String key : sH.keySet()){
            if (sH.get(key) >= 2) {
                count++;
                stack.push(key);
            }
        }

        String[] arr = new String[count];

        for(int i = 0; i < count; i++){
            arr[i] = stack.pop();
        }

        Arrays.sort(arr);

        System.out.println(count);

        for(int i = 0; i < count; i++){
            System.out.println(arr[i]);
        }


    }
}
