package TwoDArray;

import java.util.ArrayList;
import java.util.Arrays;

public class RowSum {

    static void rowSum(int[][] arr){
        ArrayList<Integer> rel = new ArrayList<>();

        for(int[] i : arr){
            System.out.println(Arrays.toString(i));
        }

        for(int i=0 ; i<arr.length ; i++){
            int sum = 0;
            for(int j=0 ; j<arr.length ; j++){
                sum += arr[i][j];
            }
            rel.add(sum);
        }
        System.out.println("Row Sum: " + rel);
    }

    static void main(){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        rowSum(arr);
    }
}
