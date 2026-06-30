package Recursion;

public class Print1toN {
                        //5
    static void print(int n){
        if (n == 0) return;
        print(n-1);
        System.out.print(n + " ");
    }

    static void main() {
        print(5);
    }
}
