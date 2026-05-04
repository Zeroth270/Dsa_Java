package Array;

public class ReverseAnArray {

    static int[] reverseArray(int[] arr, int[] revArray){
        int j = 0;
        for(int i = arr.length-1 ; i >= 0 ; i--){
          revArray[j] = arr[i];
          j++;
        }
        return revArray;
    }

    static void main() {
        int[] arr = {1,2,3,4,5};
        int[] revArray = new int[arr.length];

        revArray = reverseArray(arr,revArray);

        System.out.print("Real : ");
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Reverse : ");
        for (int i : revArray){
            System.out.print(i + " ");
        }
    }

}
