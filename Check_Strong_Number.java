package A;

public class Check_Strong_Number {
    public static void main(String[] args) {
        int n = 145;
        if (isStrong(n) == n) {
            System.out.println("Given number is a strong number");
        } else {
            System.out.println("Given number is not a strong");
        }
    }

    static int fact(int n) {
        if (n == 0) return 1;
        return n * fact(n - 1);
    }

    static int isStrong(int n) {
        if (n == 0) return 0;
        return fact(n % 10) + isStrong(n / 10);
    }
}