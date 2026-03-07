// Find the average of array elements

public class Average {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        double avg = (double) sum / arr.length;
        System.out.println(avg);
    }
}
