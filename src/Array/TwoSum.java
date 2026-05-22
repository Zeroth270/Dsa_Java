package Array;

public class TwoSum {

    static void twoSum(int[] arr, int target){

        for(int i=0 ; i< arr.length ; i++){
            int temp = target - arr[i];
            for(int j=i+1 ; j< arr.length ; j++){
                if(arr[j] == temp){
                    System.out.println("Index of First Element : " + i);
                    System.out.println("Index of Second Element : " + j);
                    System.out.println("Sum : " + target);
                    break;
                }
            }
        }

    }

    static void main() {

        int[] arr = {0,5,8,6,93,4,78,9,34};
        int target = 38;
        twoSum(arr,target);
    }

}
