package A;

public class Check_Prime_Number {
    public static void main(String[] args) {
        int n = 19;
        if (isPrime(n, n / 2)) {
            System.out.println("Given number is a prime number");
        } else {
            System.out.println("Given number is not a prime number");
        }
    }

    static boolean isPrime(int n, int i) {
        if (n <= 1) return false;
        if (i == 1) return true;
        if (n % i == 0) return false;
        return isPrime(n, i - 1);
    }
}