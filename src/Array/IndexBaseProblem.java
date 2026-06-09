package Array;

import java.util.ArrayList;
import java.util.List;

public class IndexBaseProblem {

    static List<Integer> indexBase(int[] arr){
        ArrayList<Integer> newArr = new ArrayList<>();

        //marking
        for(int i=0 ; i<arr.length ; i++){
            int value = Math.abs(arr[i]);
            int position = value - 1;
            if (arr[position] > 0){
                arr[position] = -arr[position];
            }
        }

        //return the number
        for(int j=0 ; j< arr.length ; j++){
            if(arr[j] > 0){
                newArr.add(j+1);
            }
        }
        return newArr;
    }

    static void main(){
        int[] arr = {1,4,4,5,5,2,2};
        List<Integer> ans = indexBase(arr);
        for(int a : ans){
            System.out.println(a);
        }
    }

}
