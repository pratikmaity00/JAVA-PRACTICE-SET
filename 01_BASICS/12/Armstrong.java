
public class Armstrong {
    public static void main(String[] args) {
        int n = 153,arm = 0;
        int org = n;

        while(n != 0) {
            int rem = n % 10;
            arm += Math.pow(rem, 3);
            n /= 10;
        }

        if(org == arm)
            System.out.println(org + " is an Armstrong number.");
        else
            System.out.println(org + " is not an Armstrong number.");
    }
}
