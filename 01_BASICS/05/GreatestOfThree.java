
public class GreatestOfThree {
    public static void main(String[] args) {
        int n1 = 10, n2 = 34, n3 = 3;

        if(n1>n2 && n1>n3)
            System.out.println("num1 is greatest of three.");
        else if(n2>n1 && n2>n3)
            System.out.println("num2 is greatest of three.");
        else
            System.out.println("num3 is greatest of three.");
    }
}
