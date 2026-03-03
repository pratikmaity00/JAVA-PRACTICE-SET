// 15 → factors are 1, 3, 5, 15.
// Prime factors: 3 and 5 (since both are prime).

public class PrimeFactor {
   public static void main(String[] args) {
        int n = 15;
        for(int i = 1; i<=n; i++) {
            if(n%i == 0) {
                int count = 0;
                for(int j = 1; j<=i; j++) {
                    if(i%j == 0) 
                        count++;
                }
                if(count == 2)
                    System.out.println(i);       
            }
        }
   } 
}
