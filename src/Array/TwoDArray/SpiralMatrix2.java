package Array.TwoDArray;

import java.util.Arrays;

public class SpiralMatrix2 {

    static void matrix(int k){

        int[][] arr = new int[k][k];

        int n = arr.length;
        int m = arr[0].length;

        int sr = 0;
        int er = n-1;
        int sc = 0;
        int ec = m-1;

        int i=1;

        while(sr <= er && sc <= ec){

            for(int col=sc ; col<=ec ; col++){
                arr[sr][col] = i;
                i++;
            }
            sr++;

            for(int row=sr ; row<=er ; row++){
                arr[row][ec] = i;
                i++;
            }
            ec--;

            if(sr <= er){
                for(int col=ec ; col>=sc ; col--){
                    arr[er][col] = i;
                    i++;
                }
                er--;
            }

            if(sc <= ec){
                for(int row=er ; row>=sr ; row--){
                    arr[row][sc] = i;
                    i++;
                }
                sc++;
            }
        }

        for(int[] s : arr ){
            System.out.println(Arrays.toString(s));
        }
    }

    static void main() {
        int n = 3;
        matrix(n);
    }
}
