// Count even and odd numbers in an array

public class EvenOdd {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int even = 0, odd = 0;
        for (int i : arr) {
            if(i%2 == 0) even++;
            else odd++;
        }
        System.out.println("Even count: " + even);
        System.out.println("Odd count: " + odd);
    }
}
