import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String result = "";
        int counter = 1;
        for (int i = 0; i < text.length(); i += counter) {
            counter = 1;
            for (int j = i + 1; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    counter++;
                } else {

                    break;
                }
            }
            result += text.charAt(i) + String.valueOf(counter);

        }
        System.out.println(result);
    }
}