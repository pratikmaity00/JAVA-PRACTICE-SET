
public class EvenOddInNumber {
    public static void main(String[] args) {
        int n = 124,even = 0, odd = 0,temp;
        temp = n;
        while(temp != 0) {
            int rem = temp%10;
            if(rem%2 == 0)
                even++;
            else
                odd++;
            temp /= 10;
        }
        System.out.println("Even : " + even + " | " + "Odd : " + odd);
    }
}
