package Recursion;

public class BinarySearch {


    static int binarySearch(int[] arr, int s, int e, int target){

        if(s > e) return -1;

        int mid = s + (e-s)/2;
        if(arr[mid] == target) return mid;
        if(arr[mid] < target) s = mid+1;
        else e = mid-1;

        return binarySearch(arr, s, e, target);

    }

    static void main() {
        int[] arr = {10,20,30,40,50,60,70};
        int target = 10;
        int s = 0;
        int e = arr.length-1;
        int ans = binarySearch(arr, s, e, target);
        System.out.println(ans);
    }
}
