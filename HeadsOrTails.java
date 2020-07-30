import java.util.Random;

public class HeadsOrTails {
    public static void main(String[] srgs) {
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
        if (hc > tc) System.out.println("you win!");
        else System.out.println("you lost!");
    }
}