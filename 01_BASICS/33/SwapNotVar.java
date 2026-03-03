
public class SwapNotVar {
    public static void main(String[] args) {
        int x = 2, y = 3;
        x = x + y; // 3 + 2  = 5
        y = x - y; // 5 - 3 = 2
        x = x - y; // 5 - 2 = 3

        System.out.println(x + " " + y);
    }
}
