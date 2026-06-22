package Array;

public class BookAllocationProblem {

    public static boolean isValid(int[] arr, int maxPages, int stu){
        int student = 1;
        int pages = 0;

        for (int j : arr) {
            if (pages + j <= maxPages) {
                pages += j;
            } else {
                student++;
                if (student > stu || j > maxPages) return false;
                else {
                    pages = 0;
                    pages += j;
                }
            }
        }
        return true;

    }

    public static int allocation(int[] arr, int stu){
        int s = 0;
        int e = 0;

        int ans = -1;

        for(int t : arr){
            e += t;
        }

        while(s <= e){
            int mid = s + (e-s) / 2;

            if(isValid(arr, mid, stu)){
                ans = mid;
                e = mid -1;
            }
            else{
                s = mid + 1;
            }
        }
        return ans;

    }

    static void main() {
      //  int[] arr = {12,34,67,90};
        int[] arr = {10,20,30,40};
        int k = 2;
        int ans = allocation(arr, k);
        System.out.println("ans : " + ans);
    }
}
