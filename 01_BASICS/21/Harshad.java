// A Harshad number is an integer divisible by the sum of its digits.
public class Harshad {
   public static void main(String[] args) {
        int n = 18,digitSum = 0,temp;
        temp = n;
        while (temp != 0) {
            int rem = temp % 10;
            digitSum += rem;
            temp /= 10;  
        }

        if(n % digitSum == 0)
            System.out.println("Harshad Number.");
        else
            System.out.println("Not a Harshad number.");
   } 
}
