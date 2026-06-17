package Array;

public class SearchInRotatedSortedArray {

    static int func(int[] nums){
        int n = nums.length;
        int s = 0;
        int e = n-1;

        int p = -1;

        while(s <= e){
            int mid = s + (e-s) / 2;

            if(nums[mid] <= nums[n-1]){
                e = mid -1;
            }else {
                p = mid;
                s = mid + 1;
            }
        }
        return p;
    }

    static int binarySearch(int[] nums, int target, int start, int end){

        while(start <= end){

            int mid = start + (end-start)/2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }

    static void main(){

        int[] nums = {4,5,6,7,0,1,2};
        int target = 3;

        int n = nums.length;
        int p = func(nums);

        if(p == -1){
            System.out.println(binarySearch(nums, target, 0, n - 1));;
        }

        else if(target >= nums[0] && target <= nums[p]){
            System.out.println(binarySearch(nums, target, 0, p));;
        }
        else{
            System.out.println(binarySearch(nums, target, p + 1, n - 1));;

        }
    }
}
