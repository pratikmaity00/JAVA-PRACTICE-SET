
public class PrimeinRange {
    public static void main(String[] args) {
        int range = 10;
        for(int i = 2; i<=range; i++) {
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
