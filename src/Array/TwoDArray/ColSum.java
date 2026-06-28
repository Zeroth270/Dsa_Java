package Array.TwoDArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ColSum {

    static void colSum(int[][] arr){
        List<Integer> result = new ArrayList<>();

        int r = arr.length;
        int c = arr[0].length;

        for(int[] i : arr){
            System.out.println(Arrays.toString(i));
        }

        for(int row = 0; row<r ; row++){
            int sum = 0;
            for(int col=0 ; col<c ; col++){
                sum += arr[col][row];
            }
            result.add(sum);
        }
        System.out.println("Colm Sum: " + result);
    }

    static void main(){
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        colSum(arr);
    }
}
