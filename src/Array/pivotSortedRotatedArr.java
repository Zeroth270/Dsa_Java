package Array;

public class pivotSortedRotatedArr {

    static int pivotArr(int[] arr) {
        int n = arr.length;

        int s = 0;
        int e = n - 1;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] <= arr[n-1]) {
                e = mid - 1;
            } else {
                ans = mid;
                s = mid + 1;
            }
        }

        return ans;
    }

    static void main() {
        int[] arr = {50,60,70,10,20,30,40}; //2
        //int[] arr = {9,8,1,2,3}; //1
        int a = pivotArr(arr);
        System.out.println(a);
    }
}
