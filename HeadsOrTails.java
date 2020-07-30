import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String[] srgs) {
        System.out.println("Who are you? ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hello, " + name + "!");

        String[] s = {"Heads", "Tails"};
        Random r = new Random();
        int hc = 0, tc = 0;
        System.out.println("Tossing a coin...");
        for (int i = 1; i <= 3; i++) {
            String value = s[r.nextInt(2)];
            if (value.equals("Heads")) hc++;
            else tc++;
            System.out.println("Round " + i + ": " + value);
        }

        System.out.println("Heads: " + hc + ", Tails: " + tc);

        if (hc > tc) System.out.println(name + " win!");
        else System.out.println(name + " lost!");
        scan.close();
    }
}