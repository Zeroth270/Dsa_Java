package Array;

import java.util.HashMap;

public class ModeOfArray {

    static int mod(int[] arr){
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int key : arr){
            freq.put(key, freq.getOrDefault(key,0)+1);
        }

//         for (int i : freq.keySet()){
//             System.out.println(i + " -> " + freq.get(i));
//         }

        int maxFreq = -1;
        int maxFreqKey = -1;

        for(int key : freq.keySet()){
            int currentKey = key;
            int currentKeyFreq = freq.get(key);

            if(currentKeyFreq > maxFreq){
                maxFreq = currentKeyFreq;
                maxFreqKey = currentKey;
            }
        }
        return maxFreqKey;

    }

    static void main() {
        int[] arr = {1,2,2,2,2,3,4,3,4,5,4};
        int max = mod(arr);
        System.out.println(max + " Have MAx Frequency");
    }

}
