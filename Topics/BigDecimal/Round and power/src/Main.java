import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int power = scanner.nextInt();
        int scale = scanner.nextInt();
        scanner.nextLine();
        String textNumber = scanner.nextLine();
        BigDecimal no = new BigDecimal(textNumber).setScale(scale, RoundingMode.FLOOR).pow(power);
        System.out.println(no);
    }
}