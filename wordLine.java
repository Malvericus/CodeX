import java.util.Scanner;
public class wordLine {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String w = scanner.nextLine();

        System.out.println("Enter a line: ");
        String l = scanner.nextLine();

        System.out.println(w + " " + l);
    }
}
