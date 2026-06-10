package Array;

public class SortingAlgo {

    static void bubbleSort(int[] arr){

        int n = arr.length;

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n-i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0 ; i<n-1 ; i++){
            int minIndex = i;
            for(int j=i+1 ; j<n ; j++){
                if(arr[j] < arr[i]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
        for(int k : arr){
            System.out.print(k + " ");
        }
    }

    static void insertionSort(int[] arr){
        int n = arr.length;

        for(int i=1 ; i<n ; i++){
            int curr = i;
            int prev = i-1;
            int currValue = arr[i];

            while(prev >= 0 && currValue < arr[prev]){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = currValue;
        }

        for(int k : arr){
            System.out.print(k + " ");
        }

    }

    static void main(){
        int[] arr = {6,5,4,3,2,1};
        //bubbleSort(arr);
        //selectionSort(arr);
        insertionSort(arr);
    }


}
