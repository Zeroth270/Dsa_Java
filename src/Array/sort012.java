package Array;

import java.util.Arrays;

public class sort012 {

    static void sortArray(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {

            for(int s : arr){
                System.out.print(s + " ");
            }
            System.out.println();

            if (arr[mid] == 0) {
                // swap arr[low] and arr[mid]
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;
            }

            else if (arr[mid] == 1) {
                mid++;
            }

            else { // arr[mid] == 2
                // swap arr[mid] and arr[high]
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
            for(int s : arr){
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[] arr = {2, 0, 1, 2, 1, 0, 0, 2, 1};

        sortArray(arr);

        System.out.println(Arrays.toString(arr));
    }
}
