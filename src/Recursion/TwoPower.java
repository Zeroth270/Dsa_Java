package Recursion;

public class TwoPower {

    static int twoPower(int n){

        if(n == 0){
            return 1;
        }

        int ans = 2 * twoPower(n-1);
        return ans;
    }

    static void main(){
        System.out.println(twoPower(5));
    }
}
