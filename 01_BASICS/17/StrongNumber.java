
public class StrongNumber {
    public static void main(String[] args) {
        int n = 145, sum = 0, org;
        org = n;
        while(n != 0) {
            int rem = n%10;
            int fact = 1;
            for(int i=1; i<=rem; i++) {
                fact *= i;
            }
            sum += fact;
            n /= 10;
        }
        if(org == sum)
            System.out.println("Strong Number");
        else
            System.out.println("Not a Strong Number");
    }
}
