import java.util.Scanner;
public class reverseString {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = sc.nextLine();
        String stringRev = "";

        for (int i = 0; i < str.length(); i++)
        {
            stringRev = str.charAt(i) + stringRev;
        }

        System.out.println("Reversed string: " + stringRev);
    }
}
