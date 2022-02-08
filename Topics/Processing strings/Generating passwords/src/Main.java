import java.util.*;

public class Main {
    public static void main(String[] args) {
        final int ALPHABET_DIVIDER = 25;
        final int NUMBER_DIVIDER = 9;
        final int ZERO = 0;
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int n = scanner.nextInt();
        char upper = 'A';
        char lower = 'a';
        char number = '0';
        String password = "";


        for (int u = 0; u < a; u++) {
            password += upper++;
            if (u % ALPHABET_DIVIDER == ZERO && u != ZERO) {
                upper = 'A';
            }
        }
        for (int l = 0; l < b; l++) {
            password += lower++;
            if (l % ALPHABET_DIVIDER == ZERO && l != ZERO) {
                lower = 'a';
            }
        }
        for (int no = 0; no < c; no++) {
            password += number++;
            if (no % NUMBER_DIVIDER == ZERO && no != ZERO) {
                number = '0';
            }
        }

        for (int i = password.length(); i < n; i++) {
            int rnd = (int) (Math.random() * NUMBER_DIVIDER);
            if (rnd < 3) {
                password += upper++;
            } else if (rnd < 6) {
                password += lower++;
            } else {
                password += number++;
            }
        }
        System.out.println(password);

    }
}