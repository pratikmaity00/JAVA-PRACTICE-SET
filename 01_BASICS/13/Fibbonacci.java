
public class Fibbonacci {
    public static void main(String[] args) {
        int range = 10, prev = 0, next = 1; 
        System.out.print(prev + " ");
        System.out.print(next + " ");
        for(int i=2; i<range; i++) {
            int temp = prev + next;
            prev = next;
            next = temp;
            System.out.print(next + " ");
        }
    }
}
