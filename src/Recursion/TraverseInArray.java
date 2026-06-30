package Recursion;

public class TraverseInArray {

    static void reverse(int[] arr, int index){

        if(index < 0) return ;

        System.out.print(arr[index] + " ");

        reverse(arr, index-1);
    }

    static void traverse(int[] arr, int index){

        if(index == arr.length) return;

        System.out.print(arr[index] + " ");

        traverse(arr, index+1);
    }

    static int sum(int[] arr, int index){

        if(index == arr.length) return 0;

        return arr[index] + sum(arr, index+1);

    }

    static int maxElement(int[] arr, int index, int max){

        if(index == arr.length) return max;

        if(arr[index] > max) max = arr[index];

        return maxElement(arr, index+1, max);

    }

    static void search(int[] arr, int index, int target){

        if(index == arr.length){
            System.out.println("Not Found");
            return;
        }

        if(arr[index] == target){
            System.out.println("Find A Index : " + index);
            return;
        }
        search(arr, index+1, target);
    }

    static int countElement(int[] arr, int index, int count, int target) {

        if(index >= arr.length) return count;

        if(arr[index] == target) count++;

        return countElement(arr, index+1, count, target);

    }



    static void main(){

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;


        int ans = countElement(arr, 0, 0, 1);
        System.out.println(ans);

        //search(arr, 0, 99);

//        int ans = maxElement(arr, 1, arr[0]);
//        System.out.println(ans);

//        reverse(arr, n-1);

//        traverse(arr, 0);

//        System.out.println(sum(arr, 0));

    }

}
