package Array;
import java.util.Scanner;

public class AverageOFArray {
    static void main() {

        Scanner sc = new Scanner(System.in);

//        int[] arr = {2,2,1};
//        int size = arr.length;
//        int sum = 0;
//        for(int i=0 ; i < size; i++){
//            sum = sum + arr[i];
//        }
//        System.out.println("The average of the array is: " + (float)sum/(size));

//---------------------------------------------------------------------------------------

        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int sum = 0;

        for (int i=0 ; i<n ; i++){
            System.out.print("Enter the elements of the array : ");
            arr[i] = sc.nextInt();
        }

        for(int i=0 ; i < n; i++){
           sum = sum + arr[i];
        }

        System.out.println("The average of the array is : " + sum/n);


    }
}
