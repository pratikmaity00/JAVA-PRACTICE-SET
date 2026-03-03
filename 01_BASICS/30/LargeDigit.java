
public class LargeDigit {
    public static void main(String[] args) {
        int n = 451,max = 0;
        while(n!=0) {
            int rem = n%10;
            if(rem>max) max = rem;
            n /= 10;
        }
        System.out.println(max);
    }
}
