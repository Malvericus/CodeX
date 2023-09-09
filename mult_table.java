import java.util.Scanner;
public class mult_table {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= 10; i++)
        {
            int product = n * i;
            System.out.println(n + " X " + i + " = " + product);
        }

    }

}