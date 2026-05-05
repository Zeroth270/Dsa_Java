package Array;

public class ShiftElementByK {

    static void rightShiftByK(int[] arr, int k){
        int size = arr.length;
        int[] temp = new int[k];

        for(int i=0 ; i<k ; i++){
            temp[i] = arr[size - k + i];
        }

        for(int i=size-1 ; i>=k ; i--){
            arr[i] = arr[i - k];
        }

        for(int i=0 ; i<k ; i++){
            arr[i] = temp[i];
        }

        for(int i : arr){
            System.out.print(i + " ");
        }


    }

    static void main(){
        //             0  1  2  3  4  5
        int[] arr = {11,12,13,14,15,16};
        rightShiftByK(arr,2);
    }

}
