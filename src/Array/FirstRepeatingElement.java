package Array;

import java.util.HashMap;

public class FirstRepeatingElement {

    static void repeatingElement(int[] arr){
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int i : arr){
            freq.put(i, freq.getOrDefault(i,0) + 1);
        }

        for(int n : freq.keySet()){

        }

    }

    static void main() {
        int[] arr = {4,2,1,4,3,5,2,1};
        repeatingElement(arr);
    }

}
