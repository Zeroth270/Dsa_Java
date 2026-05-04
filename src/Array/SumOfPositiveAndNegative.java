package Array;

public class SumOfPositiveAndNegative {

    static void sumPosAndNeg(int[] arr){
        int negSum = 0;
        int posSum = 0;
        for(int i : arr){
            if (i < 0) negSum += i;
            else posSum += i;
        }
        System.out.println("Positive Sum : " + posSum);
        System.out.println("Negative Sum : " + negSum);
    }

    static void main() {
        int[] arr = {25,-10,10,-25};
        sumPosAndNeg(arr);
    }
}
