import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        StringTokenizer st = new StringTokenizer(s, " ");


        int result = 0;

        int a = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        int b = (S * 2) - a;

        System.out.println(b);
    }

    ;
}