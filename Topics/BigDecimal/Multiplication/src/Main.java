import java.math.BigDecimal;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        BigDecimal no1 = new BigDecimal(scanner.nextLine());
        BigDecimal no2 = new BigDecimal(scanner.nextLine());
        System.out.println(no1.multiply(no2));
    }
}