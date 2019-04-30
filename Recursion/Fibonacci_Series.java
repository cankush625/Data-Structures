package Recursion;

public class Fibonacci_Series {
    public static int fibo(int n){
        int result;
        if(n == 1 || n == 2){
            result = 1;
        }else{
            result = fibo(n - 1) + fibo(n - 2);
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(fibo(5));
    }
}
