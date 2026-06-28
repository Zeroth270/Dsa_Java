package Array.TwoDArray;

import java.util.ArrayList;
import java.util.List;

public class spiralPrint {

    static void spiral(int[][] arr){

        List<Integer> rel = new ArrayList<>();

        int m = arr.length;
        int n = arr[0].length;

        int startRow = 0;
        int endRow = m-1;
        int startCol = 0;
        int endCol = n-1;

        while(startCol <= endCol && startRow <= endRow){

            for(int col=startCol ; col<=endCol ; col++){
                rel.add(arr[startRow][col]);
            }
            startRow++;

            for(int row=startRow ; row<=endRow ; row++){
                rel.add(arr[row][endCol]);
            }
            endCol--;

            if (startRow <= endRow) {
                for(int col=endCol ; col>=startCol ; col--){
                    rel.add(arr[endRow][col]);
                }
                endRow--;
            }

            if (startCol <=endCol){
                for(int row=endRow ; row>=startRow ; row--){
                    rel.add(arr[row][startCol]);
                }
                startCol++;
            }
        }

        for(int k : rel){
            System.out.print(k + " ");
        }

    }

    static void main(){

        //int[][] arr = {{1,6,7,15,19} ,{8,2,11,13,20} ,{14,9,3,10,18} , {22,12,17,4,21} ,{24,25,16,23,5}};
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        spiral(arr);
    }
}
