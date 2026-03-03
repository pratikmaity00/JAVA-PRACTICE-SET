
public class SwapUseVar {
    public static void main(String[] args) {
        int x = 2, y = 3,temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println(x); // 3
        System.out.println(y); // 2
    }
}
