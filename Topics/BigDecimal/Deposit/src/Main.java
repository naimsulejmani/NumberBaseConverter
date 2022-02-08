import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        BigDecimal startingAmount = new BigDecimal(scanner.nextLine());
        double interestRate = scanner.nextDouble();
        int numberOfYears = scanner.nextInt();

        BigDecimal finalAmount = startingAmount.multiply(
                BigDecimal.ONE.add(BigDecimal.valueOf(interestRate / 100)).pow(numberOfYears)
        ).setScale(2, RoundingMode.CEILING);

        System.out.printf("Amount of money in the account: %s", finalAmount);
    }
}