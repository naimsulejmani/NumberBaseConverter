import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        BigDecimal no1 = new BigDecimal(scanner.nextLine());
        BigDecimal no2 = new BigDecimal(scanner.nextLine());
        BigDecimal no3 = new BigDecimal(scanner.nextLine());

        BigDecimal avg = no1.add(no2).add(no3)
                .divide(BigDecimal.valueOf(3L), 0, RoundingMode.DOWN);

        System.out.println(avg);
    }
}