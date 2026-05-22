package Array;

public class Sort0And1 {

    static void sort(int[] arr){
        int i = 0;
        int j = arr.length-1;

        while(i <= j){
            if(arr[i] == 0 && arr[j] == 1){
                i++;
                j--;
            } else if (arr[i] == 1 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else if (arr[i] == 1 && arr[j] == 1) {
                j--;
            } else if (arr[i] == 0 && arr[j] == 0) {
                i++;
            }
        }
        for (int k : arr){
            System.out.print(k + " ");
        }

    }

    static void main() {
        int[] arr = {1,1,0,1,1,0,0,1,0};
        sort(arr);
    }


}
