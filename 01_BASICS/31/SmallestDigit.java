
public class SmallestDigit {
    public static void main(String[] args) {
        int n = 451,min = 9;
        while(n!=0) {
            int rem = n%10;
            if(rem<min) min = rem;
            n /= 10;
        }
        System.out.println(min);
    }
}
