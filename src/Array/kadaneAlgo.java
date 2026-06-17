package Array;

public class kadaneAlgo {

    public static int kadane(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    static void main() {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int ans = kadane(arr);
        System.out.println(ans);
    }

}
