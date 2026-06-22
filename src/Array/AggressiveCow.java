package Array;

import java.util.Arrays;

public class AggressiveCow {

    static boolean isValid(int[] stall, int k, int minLength){
        int cow = 1;
        int lastPosition = 0;

        for(int i=1 ; i<stall.length ; i++){
            if(stall[i] - stall[lastPosition] >= minLength){
                cow++;
                lastPosition = i;
                if(cow == k) return true;
            }
        }
        return false;
    }

    static int aggressiveCow(int[] stall, int k){
        Arrays.sort(stall);

        int n = stall.length;
        int s = 0;
        int e = stall[n-1] - stall[0];

        int ans = -1;

        while(s <= e){
            int mid = s + (e-s) / 2;
            if(isValid(stall, k, mid)){
                ans = mid;
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }
        return ans;

    }

    static void main() {
        int[] stalls = {1,2,4,8,9};
        int cow = 3;
        int ans = aggressiveCow(stalls, cow);
        System.out.println(ans);
    }

}
