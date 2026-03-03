
public class ApearDigits {
    public static void main(String[] args) {
        int n = 11163,  key = 1,count = 0;
        while(n!=0) {
            int rem = n % 10;
            if(rem == key) count++;
            n /= 10;
        }
        System.out.println(count);
    }
    
}
