// Find the smallest element in an array
public class Samllest {
    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 9, 3};
        int min = arr[0];
        for(int i = 1; i<arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
