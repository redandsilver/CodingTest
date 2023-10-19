package section6_SortingandSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q6_장난꾸러기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] tmp = arr.clone();
        Arrays.sort(arr);
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(arr[i] !=tmp[i] ){
                answer.add(i+1);
            }
        }
        for(int i: answer){
            System.out.print(i+" ");
        }
    }
}
