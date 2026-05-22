package Array;

public class DuplicateElement {

    static void duplicate(int[] arr){

        for(int i=0 ; i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[j] == arr[i]){
                    arr[j] = -1;
                }
            }
        }

        int count  = 0;
        for(int k : arr){
            if(k != -1){
                System.out.print(k + " ");
                count++;
            }
        }
        System.out.println("Count : " + count);

    }

    static void main() {
        int[] arr = {4,2,1,4,3,5,2,1};
        duplicate(arr);
    }

}
