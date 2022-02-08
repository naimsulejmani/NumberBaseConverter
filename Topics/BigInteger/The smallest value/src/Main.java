import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        BigInteger m = new BigInteger(scanner.next());
        BigInteger pow = BigInteger.ONE;
        long counter = 1;
        while (pow.compareTo(m) < 0) {
            pow = pow.multiply(BigInteger.valueOf(counter++));
        }
        System.out.println(counter - 1);
    }
}