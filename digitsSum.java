import java.util.Scanner;
public class digitsSum {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;
        int n = number;

        while (number > 0)
        {
            int digit = number % 10;
            sum = sum + digit;
            number = number/10;
        }

        System.out.println("Sum of digits of " + n + " is " + sum);
    }
}
