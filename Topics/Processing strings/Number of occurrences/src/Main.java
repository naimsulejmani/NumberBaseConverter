import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String occur = scanner.nextLine();

        System.out.println(countTheSubString(text, occur));
    }

    static int countTheSubString(String text, String occur) {
        int textLength = text.length();
        int occurLength = occur.length();
        int counter = 0;

        int j = 0;
        for (int i = 0; i <= textLength - occurLength; ) {
            for (j = 0; j < occurLength; j++) {
                if (text.charAt(i + j) != occur.charAt(j)) {
                    break;
                }
            }
            if (j == occurLength) {
                counter++;
                i += j;
            } else {
                i++;
            }
        }
        return counter;
    }
}