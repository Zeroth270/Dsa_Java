package Array;

public class MissingElement {

    static int missingEle(int[] arr){
        int n = arr.length;
        int xorSum = 0;

        for (int i : arr){
            xorSum = xorSum ^ i;
        }

        for(int i=0 ; i<=n ; i++){
            xorSum = xorSum ^ i;
        }
        return xorSum;

    }

    static void main(){
        int[] arr = {0,1,2,3,4,5,6,8,9};
        int result = missingEle(arr);
        System.out.println(result);
    }

}
