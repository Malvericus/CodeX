import java.util.Scanner;
public class spyNumber {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int n = number;
        int sum = 0;
        int product = 1;

        while (number > 0)
        {
            int d = number % 10;
            sum = sum + d;
            product = product * d;
            number = number/10;
        }

        if (sum == product)
        {
            System.out.println("The number " + n + " is a Spy Number.");
        }
        else
        {
            System.out.println("The number " + n + " is not a Spy Number.");
        }

    }
}
