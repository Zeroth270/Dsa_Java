package Array;

public class EkoSpojProblem {

    static boolean isVerified(int[] tree, int m, int mid){
        int woodCollect = 0;

        for (int j : tree) {
            if (j >= mid) {
                woodCollect += (j - mid);
            }
        }
        if(woodCollect >= m) return true;

        return false;
    }

    static int check(int[] tree, int m){
        int n = tree.length;
        int max = 0;
        int ans = -1;

        for(int k : tree){
            if(k > max) max = k;
        }

        int s = 0;
        int e = max;

        while(s <= e){
            int mid = s + (e-s) / 2;
            if(isVerified(tree, m, mid)){
                ans = mid;
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }

        }
        return ans;
    }

    static void main() {
//        int[] tree = {20,15,10,17};
//        int m = 7;
        int[] tree = {1,2,3,4,5};
        int m = 5;

        int ans = check(tree, m);
        System.out.println(ans);
    }
}
