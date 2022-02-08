import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        BigDecimal no = new BigDecimal(scanner.nextLine());
        int newScale = scanner.nextInt();

        System.out.println(no.setScale(newScale, RoundingMode.HALF_DOWN));
    }
}