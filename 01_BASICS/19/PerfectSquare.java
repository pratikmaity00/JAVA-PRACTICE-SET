// Perfect square or square root
public class PerfectSquare {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++) {
            if(n == i*i) {
                System.out.println("Perfect Square");
                return;
            }
        }
        System.out.println("Not Perfect Square");

        // int n = 5;
        // int sqrt = (int)Math.sqrt(n);
        // if (sqrt * sqrt == n) {
        //     System.out.println("Perfect Square");
        // } else {
        //     System.out.println("Not Perfect Square");
        // }

    }
}
