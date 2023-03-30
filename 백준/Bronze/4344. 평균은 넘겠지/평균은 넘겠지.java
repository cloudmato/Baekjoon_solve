import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for(int i=0;i<num;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int studentNum = Integer.parseInt(st.nextToken());
            int[] scores = new int[studentNum];
            double sum = 0;

            for(int j=0;j<studentNum;j++){
                int person = Integer.parseInt(st.nextToken());
                scores[j]=person;
                sum+=person;
            }
            double avg =( sum/studentNum);
            double cnt = 0;

            for(int k=0;k<studentNum;k++){
                if(scores[k]>avg) {
                    cnt++;

                }
            }
            System.out.printf("%.3f%%\n",(cnt/studentNum)*100);
        }
    }
}