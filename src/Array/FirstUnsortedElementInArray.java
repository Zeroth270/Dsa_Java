package Array;

public class FirstUnsortedElementInArray {

    static void unSortedElement(int[] arr){
        int flag = 0;
        for(int i=0 ; i< arr.length ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[i] > arr[j]){
                    System.out.print(arr[i]);
                    flag = 1;
                    break;
                }
            }
        }
        if(flag == 0) System.out.println("Array Is Sorted");
        else System.out.println(" Is Unsorted Element!");
    }

    static void main() {
        int[] arr = {1,2,3,4,5,7,8};
        unSortedElement(arr);
    }

}
