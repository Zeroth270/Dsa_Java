package Array;

public class ArrayLineaSearch {

    static void linearSearch(int[] arr, int target){
        int flag = 1;
        for(int i: arr){
            if(i == target) {
                flag = 0;
                break;
            }
        }
        if (flag == 0) System.out.println("Find");
        else System.out.println("Not Found");

    }

    static void main(){
        int[] arr = {69,38,46,59,40};
        linearSearch(arr,6);
    }

}
