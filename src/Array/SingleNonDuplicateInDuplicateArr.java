package Array;

public class SingleNonDuplicateInDuplicateArr {

    static int nonDuplicate(int[] arr){
        int n = arr.length;
        int s = 0;
        int e = n-1;

        int mid = s + (e-s) / 2;

        while(s <= e){

            if(s == e) return mid;

            if((mid & 1) == 1){
                //iska matlab vo odd he, to usey even kar do
                mid--;
            }

            if(arr[mid] == arr[mid+1]){
                s = mid + 2;
            }
            else{
                e = mid -1;
            }
            mid = s + (e-s) / 2;
        }
        return arr[mid];
    }

    static void main(){
        int[] arr = {10,10,20,30,30,40,40,50,50,60,60};
        System.out.println(nonDuplicate(arr));

    }
}
