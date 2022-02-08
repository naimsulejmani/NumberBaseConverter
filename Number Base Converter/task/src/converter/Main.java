package converter;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        String number;
        BigDecimal nr;
        do {
            System.out.print("Enter two numbers in format: {source base} {target base} (To quit type /exit) ");
            number = scanner.nextLine();
            if (number.equalsIgnoreCase("/exit")) {
                break;
            }
            String sourceBase = number.split(" ")[0];
            String targetBase = number.split(" ")[1];
            System.out.printf("Enter number in base %s to convert to base %s (To go back type /back) ", sourceBase, targetBase);
            String sourceNumber = scanner.nextLine().toUpperCase();
            while (!sourceNumber.equalsIgnoreCase("/back")) {
                if (!sourceBase.equals("10")) {
                    nr = convertToDecimal(sourceNumber, Integer.parseInt(sourceBase));
                } else {
                    nr = new BigDecimal(sourceNumber);
                }
                String result = sourceBase.equals(targetBase) ? nr.toString() : convert(nr, Integer.parseInt(targetBase));
                System.out.printf("Conversion result: %s%n%n", result);
                System.out.printf("Enter number in base %s to convert to base %s (To go back type /back) ", sourceBase, targetBase);
                sourceNumber = scanner.nextLine().toUpperCase();
            }
        }
        while (true);
    }

    private static String convert(BigDecimal nr, int targetBase) {
        if (targetBase == 10) {
            return nr.toString();
        }
        BigDecimal[] numbers = nr.divideAndRemainder(BigDecimal.ONE);
        BigDecimal fract = BigDecimal.ZERO;
        if (numbers.length == 2) {
            nr = numbers[0];
            fract = numbers[1];
        }
        String result = convertIntegerPart(nr, targetBase);
        if (numbers.length == 2 && !fract.equals(BigDecimal.ZERO)) {
            result += convertFractionPart(fract, targetBase);
        }
        return result;
    }

    private static String convertFractionPart(BigDecimal fract, int targetBase) {
        StringBuilder result = new StringBuilder(".");
        int counter = 5;
        while (fract.compareTo(BigDecimal.ZERO) > 0 & counter-- > 0) {
            fract = fract.multiply(BigDecimal.valueOf(targetBase));
            BigDecimal[] parts = fract.divideAndRemainder(BigDecimal.ONE);
            fract = fract.subtract(parts[0]);
            result.append(getCharacter(parts[0].intValue()));
        }
        return result.toString();
    }

    private static String convertIntegerPart(BigDecimal nr, int targetBase) {
        StringBuilder result = new StringBuilder();
        while (nr.compareTo(BigDecimal.ZERO) > 0) {
            BigDecimal[] dividerAndReminder = nr.divideAndRemainder(BigDecimal.valueOf(targetBase));
            nr = dividerAndReminder[0];
            result.insert(0, getCharacter(dividerAndReminder[1].intValue()));
        }
        return result.toString();
    }

    private static BigDecimal convertToDecimal(String number, int base) {
        String[] numbers = number.split("\\.");
        System.out.println(numbers.length);
        int length = number.length() - 1;
        if (numbers.length == 2) {
            length = numbers[0].length() - 1;
        }
        BigDecimal sum = BigDecimal.ZERO;
        int index = 0;
        while (index < number.length()) {
            char valStr = number.toUpperCase().charAt(index++);
            if (valStr == '.') continue;
            int no = getNumber(valStr);
            double val = Math.pow(base, length--);
            sum = sum.add(BigDecimal.valueOf(no).multiply(BigDecimal.valueOf(val)));
        }
        return sum;
    }

    private static int getNumber(char val) {
        if (val >= '0' && val <= '9') {
            return Integer.parseInt(String.valueOf(val));
        }
        return (int) val - 55;
    }

    private static char getCharacter(int mod) {
        if (mod >= 0 && mod <= 9) {
            return String.valueOf(mod).charAt(0);
        } else {
            return (char) (mod + 55);
        }
    }
}
