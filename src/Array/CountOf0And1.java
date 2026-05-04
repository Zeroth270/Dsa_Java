package Array;

public class CountOf0And1 {

    static void count(int[] arr){
        int count1 = 0;
        int count0 = 0;
        for(int i : arr){
            if(i == 0) count0++;
            else if(i == 1) count1++;
        }
        System.out.println("Count 1 : " + count1);
        System.out.println("Count 0 : " + count0);
    }

    static void main() {
        int[] arr = {1,0,1,0,1,0,24,0,0,0,1};
        count(arr);
    }
}
