import java.math.BigInteger;

class DoubleFactorial {
    public static BigInteger calcDoubleFactorial(int n) {
        // type your java code here
        BigInteger pow = BigInteger.ONE;
        while (n > 0) {
            pow = pow.multiply(BigInteger.valueOf(n));
            n -= 2;
        }
        return pow;
    }
}