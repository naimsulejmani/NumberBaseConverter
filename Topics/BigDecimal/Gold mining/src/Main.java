import java.math.BigDecimal;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        BigDecimal dwalin = new BigDecimal(scanner.nextLine());
        BigDecimal balin = new BigDecimal(scanner.nextLine());
        BigDecimal thorin = new BigDecimal(scanner.nextLine());

        System.out.println(dwalin.add(balin).add(thorin));
    }
}