package Array;

public class MaxInArray {

    static void max(int[] arr){
        int max = arr[0];
        for (int j : arr) {
//            if (j > max) max = j;
            max = Math.max(max,j);
        }

        System.out.println(max);
    }

    static void main(){
        int[] arr = {99,45,89,84,3,90};
        max(arr);
    }
}
