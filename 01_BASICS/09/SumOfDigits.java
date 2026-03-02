
public class SumOfDigits {
    public static void main(String[] args) {
        int n = 125, sum = 0;
        int org = n;
        while(n != 0) {
            int rem = n%10;
            sum += rem;
            n /= 10;
        }
        System.out.println("Sum of " + org + " is : " + sum);
    }
}
