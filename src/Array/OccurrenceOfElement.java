package Array;

public class OccurrenceOfElement {

    static int lowerBound(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(arr[mid] >= target){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;

    }

    static int upperBound(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end-start) /2;

            if(arr[mid] <= target){
                start = mid + 1;
            }else{
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }

    static void main() {
      //  int[] arr = {10,20,20,20,20,30,40,50};
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        int lb = lowerBound(arr,target);
        int ub = upperBound(arr,target);
        int ans = ub - lb;
        System.out.println("Occurrence : " + ans);
    }
}
