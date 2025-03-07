package A;

public class Check_Fibonacci_Series {
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;
        System.out.print(a + ", " + b + ", ");
        isFibonacci(a, b, n - 2);
    }

    static void isFibonacci(int a, int b, int n) {
        if (n == 0) return;
        int c = a + b;
        System.out.print(c + ", ");
        isFibonacci(b, c, n - 1);
    }

}
