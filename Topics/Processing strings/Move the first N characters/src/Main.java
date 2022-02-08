import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        int n = scanner.nextInt();

        if (n < text.length()) {
            text = text.substring(n) + text.substring(0, n);
        }
        System.out.println(text);
    }
}