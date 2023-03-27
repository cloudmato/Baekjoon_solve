import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] submit = new int[28];

        for(int i=0;i<submit.length;i++){
            submit[i]=parseInt(br.readLine());
              }
        for(int i=1;i<=30;i++){
            for(int j=0;j<submit.length;j++){
                if(i==submit[j]){
                    break;
                }
                if(j==27){
                    System.out.println(i);
                }
            }
        }
        }
    }
