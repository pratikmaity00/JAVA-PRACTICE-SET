
public class Factorial {
    public static void main(String[] args) {
        int n = 0, fact = 1;

        if(n == 0) {
            System.out.println(fact);
        }else {
            for(int i=1; i<=n; i++) {
                fact *= i;
            }
            System.out.println("Factorial of " + n + " is " + fact);
        }
    }
}
