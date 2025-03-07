package A;

public class Check_Palindrome_Number {
    public static void main(String[] args) {
        int n = 232;
        if (isPalindom(n, 0) == n) {
            System.out.println("Given number is a palindrome number.");
        } else {
            System.out.println("Given number is not a palindrome number.");
        }
    }

    static int isPalindom(int n, int sum) {
        if (n == 0) return sum;
        sum = (sum * 10) + (n % 10);
        return isPalindom(n / 10, sum);
    }
}
