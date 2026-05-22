package Array;

public class PivotElement {

    static void pivotElement(int[] arr){
        int size = arr.length;
        int[] leftArr = new int[size];
        int[] rightArr = new int[size];
        int leftSum = 0;
        int rightSum = 0;

        //sum from left
        for(int i=0 ; i<leftArr.length ; i++){
            leftSum += arr[i];
            leftArr[i] = leftSum;
        }

        System.out.println(leftSum);
        for(int i : leftArr){
            System.out.print(i + " ");
        }
        System.out.println();

        //sum from right
        for(int j = arr.length-1;  j>=0 ; j--){
            rightSum += arr[j];
            rightArr[j] = rightSum;
        }

        System.out.println(leftSum);
        for(int i : rightArr){
            System.out.print(i + " ");
        }

        System.out.println();
        for(int k=0 ; k< arr.length ; k++){
            if (leftArr[k] == rightArr[k]){
                System.out.println(k + " This is Pivot.");
            }
        }

    }

    static void main() {
        int[] arr = {1,7,3,6,5,6};
        pivotElement(arr);
    }

}
