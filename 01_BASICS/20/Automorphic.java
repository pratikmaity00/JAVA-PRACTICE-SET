// An automorphic number is a number whose square ends with the same digits as the number itself.
public class Automorphic {
    public static void main(String[] args) {
        int n = 76,org;
        org = n;
        int square = (int) Math.pow(org,2);

        int digits = 0;
        while(n!=0) {
            n /= 10;
            digits++;
        }

        // Otherwise this is the way to find how many digits have
        // int digits = String.valueOf(n).length();

        int mod = (int) Math.pow(10,digits);
        
        if(square % mod == org) {
            System.out.println("Automorphic");
            // return;
        }else 
            System.out.println("Not Automorphic");
    }
}
