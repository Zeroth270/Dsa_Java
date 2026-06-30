package Recursion;

public class PrintName {

    static void printName(int n){
        if(n == 0) return;

        System.out.println("Luffy");

        printName(n-1);
    }

    static void main() {

    }
}
