package Array;

import java.util.HashMap;

public class HighestAndLowestFrequency {

    static int[] mod(int[] arr){
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int key : arr){
            freq.put(key, freq.getOrDefault(key,0)+1);
        }

        int highFreq = Integer.MIN_VALUE;
        int highestNum = -1;
        for(int key : freq.keySet()){
            int currentNum = key;
            int currentFreq  = freq.get(key);
            if(currentFreq > highFreq){
                highFreq = currentFreq;
                highestNum = currentNum;
            }
        }

        int lowestFreq = Integer.MAX_VALUE;
        int lowestNum = -1;
        for(int key : freq.keySet()){
            int currentNum = key;
            int currentFreq = freq.get(key);
            if(lowestFreq > currentFreq){
                lowestFreq = currentFreq;
                lowestNum = currentNum;
            }
        }
        int[] ans = {highestNum, lowestNum};
        return ans;

    }

    static void main() {
        int[] arr = {1,2,2,2,2,3,4,3,4,5,4,5,5,5,5,5,5,5,5};
        int[] ans = mod(arr);
        System.out.println(ans[0] + " Is Highest Frequency");
        System.out.println(ans[1] + " Is Lowest Frequency");
    }
}
