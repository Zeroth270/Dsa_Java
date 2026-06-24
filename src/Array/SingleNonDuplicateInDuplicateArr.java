package Array;

public class SingleNonDuplicateInDuplicateArr {

    static int nonDuplicate(int[] arr){
        int n = arr.length;
        int s = 0;
        int e = n-1;

        while(s <= e){
            int mid = s + (s-e) / 2;

            if(s == e) return mid;

            int currentValue = arr[mid];
            int previous = -1;

            if(arr[previous])

        }

    }

    static void main(){
        int[] arr = {10,10,20,20,30,30,40,40,50,60,60};
        int ans = nonDuplicate(arr);
        System.out.println(ans);
    }
}
