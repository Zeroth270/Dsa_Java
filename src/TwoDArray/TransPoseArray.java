package TwoDArray;

import java.util.Arrays;

public class TransPoseArray {

    static void transPose(int[][] arr){
        int totalRow = arr.length;
        int totalCol = arr[0].length;

        int newTotalRow = totalCol;
        int newTotalCol = totalRow;

        int[][] result = new int[newTotalRow][newTotalCol];

        for(int i=0 ; i<newTotalRow ; i++){
            for(int j=0 ; j<newTotalCol ; j++) {
                result[i][j] = arr[j][i];
            }
        }

        for(int[] k : result) {
            System.out.println(Arrays.toString(k));
        }

    }

    static void main(){
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        transPose(arr);
    }
}
