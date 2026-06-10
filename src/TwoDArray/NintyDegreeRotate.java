package TwoDArray;

import java.util.Arrays;

public class NintyDegreeRotate {

    static void rotate(int[][] arr){
        int n = arr.length;

        for(int i=0 ; i<n ; i++){   
            for(int j=i+1 ; j<n ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        System.out.println("Transpose Matrix");
        for(int[] k : arr){
            System.out.println(Arrays.toString(k));
        }

        for(int row = 0; row <n ; row++){
            int startCol = 0;
            int endCOl = n-1;

            while(startCol <= endCOl){
                int temp = arr[row][startCol];
                arr[row][startCol] = arr[row][endCOl];
                arr[row][endCOl] = temp;
                startCol++;
                endCOl--;
            }

        }

        System.out.println();
        System.out.println("90 Degree Rotate Matrix");
        for(int[] k : arr){
            System.out.println(Arrays.toString(k));
        }

    }

    static void main() {
        //int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr = {{1,2},{4,5}};
        rotate(arr);
    }
}
