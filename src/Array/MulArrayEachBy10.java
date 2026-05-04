package Array;
public class MulArrayEachBy10 {

    static void mul(int[] arr){
        int mul = 1;
        for(int i : arr){
            mul  = i * 10;
            System.out.println(mul);
        }
    }

    static void main() {
        int[] arr = {1,2,3,4,5};
        mul(arr);
    }
}
