package Array;

public class BinarySearch {

    static boolean binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int mid = (start + end) / 2;

        while(start <= end){

            if(arr[mid] == target){
                System.out.println("Index : " + mid);
                return true;
            }
            else if(arr[mid] < target ){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        return false;
    }

    static void main() {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 9;
        boolean ans = binarySearch(arr,target);
        System.out.println(ans);
    }
}
