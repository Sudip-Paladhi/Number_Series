package A;

public class Check_ArmStrong_Number {
    public static void main(String[] args) {
        int n = 153;
        int c = count(n);
        if (isArmstrong(n, c) == n) {
            System.out.println("Given number is a Armstrong number");
        } else {
            System.out.println("Given number is not a Armstrong number");
        }
    }

    static int count(int n) {
        if (n == 0) return 0;
        return 1 + count(n / 10);
    }

    static int isArmstrong(int n, int count) {
        if (n == 0) return 0;
        return (int) Math.pow(n % 10, count) + isArmstrong(n / 10, count);
    }
}
