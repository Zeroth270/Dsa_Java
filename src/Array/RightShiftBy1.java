package Array;

public class RightShiftBy1 {

    static void rightShift(int[] arr){
        int lastElem = arr[arr.length-1];
        for(int i=arr.length-1 ; i>0 ; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = lastElem;
        for (int k : arr){
            System.out.print(k + " ");
        }
    }

    static void main(){
      //             0  1  2  3  4  5
        int[] arr = {11,12,13,14,15,16};
        rightShift(arr);
    }

}
