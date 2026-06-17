package Array;

public class PeakOfMountain {

    static void peakElement(int[] arr){

        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end-start) / 2;

            if(arr[mid] >= arr[mid + 1]){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        System.out.println("Index : " + ans);

    }

    static void main() {
        //int[] arr = {10,20,30,40,50,35,20}; // Ans 50
        int[] arr = {1,3,5,4,2};
        peakElement(arr);
    }

}
