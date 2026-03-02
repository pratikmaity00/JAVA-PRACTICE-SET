
public class Palindrome {
    public static void main(String[] args) {
        int n = 121, rev = 0;
        int org = n;
        while(n != 0) {
            int rem = n % 10;
            rev = rev*10 + rem;
            n /= 10;
        }
        if(org == rev)
            System.out.println(org + " is palindrome.");
        else 
            System.out.println(org + " is not palindrome.");
    }
}
