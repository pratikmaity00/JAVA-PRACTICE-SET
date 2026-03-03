
public class StrongPair {
    public static void main(String[] args) {
        int n1 = 6, n2 = 28, n1Sum = 0, n2Sum = 0;

        for(int i = 1; i<=n1; i++) {
            if(n1%i ==0)
                n1Sum += i;
        }
        for(int i = 1; i<=n2; i++) {
            if(n2%i ==0)
                n2Sum += i;
        }
        
        if(n1Sum/n1 == n2Sum/n2)
            System.out.println("Strong Pair.");
        else
            System.out.println("Not a Strong Pair.");
    }
}
