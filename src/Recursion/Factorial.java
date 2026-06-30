package Recursion;

public class Factorial {

    static int fact(int n){
        if(n == 0){
            return 1;
        }

        int ans = n * fact(n-1);
        return ans;
    }

    static void main(){
        System.out.println(fact(5));
    }
}
