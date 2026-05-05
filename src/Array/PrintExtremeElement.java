package Array;

public class PrintExtremeElement {

    static void extreElement(int[] arr){
        int j= arr.length-1;

        for(int i=0 ; i<=j ; i++){
            System.out.print(arr[i] + " ");
            if (i == j) break;
            System.out.print(arr[j] + " ");
            j--;
        }

    }

    static void main() {
        int[] arr = {11,12,13,14,15,16,17};
        extreElement(arr);
    }

}
