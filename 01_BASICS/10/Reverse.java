
public class Reverse {
    public static void main(String[] args) {
        int n = 123, rev = 0;
        int org = n;
        while(n != 0) {
            int rem = n%10;
            rev = rev*10 + rem;
            n /= 10;
        }
        System.out.println("Reverse of " + org + " is : " + rev);
    }
}
