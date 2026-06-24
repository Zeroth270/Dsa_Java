package Array;

public class RotiParathaProblem {

    static boolean isValid(int roti, int[] rank, int mid) {

        int totalParatha = 0;

        for (int k : rank) {

            int time = 0;
            int j = 1;

            while (time + k * j <= mid) {
                time += k * j;
                totalParatha++;
                j++;

                if (totalParatha >= roti) {
                    return true;
                }
            }
        }
        return false;
    }

    static int rotParatha(int roti, int chef, int[] rank) {

        int s = 0;
        int e = rank[0] * (roti * (roti + 1)) / 2;

        int ans = -1;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (isValid(roti, rank, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return ans;
    }

    static void main() {

        int roti = 10;
        int chef = 4;
        int[] rank = {1, 2, 3, 4};

        int ans = rotParatha(roti, chef, rank);

        System.out.println("Minimum Time = " + ans);
    }
}