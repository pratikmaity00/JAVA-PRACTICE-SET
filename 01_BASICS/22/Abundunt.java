// An abundant number is a positive integer whose sum of proper divisors exceeds the number itself.
class Abundunt {
    public static void main(String[] args) {
        int n = 24,sum = 0;
        for(int i = 1; i<n; i++) {
            if(n%i == 0) {
                sum += i;
            }
        }
        if(sum > n) {
            int abundunce = sum - n;
            System.out.println("Abundunt Number");
            System.out.println("Abundunce is : " + abundunce);
        }
        else
            System.out.println("Not Abundunt Number");
    }
}