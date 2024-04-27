package com.lam.mathematics.arithmetic;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * HyperSkill task.
 * Number Base Converter (Java)
 */
public class BaseConvertor {

    public static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private final BigDecimal base;
    private final BigDecimal decimal;
    private final BigDecimal whole;
    private final BigDecimal fraction;

    StringBuilder result;

    public BaseConvertor(BigDecimal decimal, BigDecimal base) {
        this.decimal = decimal;
        this.base = base;
        this.result = new StringBuilder();
        this.whole = decimal.setScale(1, RoundingMode.FLOOR);
        this.fraction = decimal.divideAndRemainder(new BigDecimal("1"))[1];
    }

    public String getResult() {
        return this.result.toString();
    }

    public void conversionFraction() {
        int steps = 5;
        StringBuilder builder = new StringBuilder();

        BigDecimal fractionCopy = this.fraction;

        if (!decimal.toString().contains(".")) {
            return;
        }

//        if (fractionCopy.compareTo(BigDecimal.ZERO) == 0) {
//        	return;
//        }

        while (true) {
            fractionCopy = fractionCopy.multiply(base);

            BigDecimal truncated = fractionCopy.setScale(0, RoundingMode.FLOOR);

            if (truncated.compareTo(new BigDecimal("9")) > 0) {
                builder.append(ALPHABET.charAt(truncated.intValue() - 10));
            } else {
                builder.append(truncated.intValue());
            }

            fractionCopy = fractionCopy.divideAndRemainder(new BigDecimal("1"))[1];

//			if (steps == 1 || fractionCopy.compareTo(BigDecimal.ZERO) == 0) {
            if (steps == 1) {
                break;
            }
            steps--;
        }

        this.result.append(".").append(builder.toString());
    }

    public void conversionWhole() {

        BigDecimal quotient = null;
        BigDecimal remainder = null;

        BigDecimal wholeCopy = whole;

        while (wholeCopy.compareTo(base) >= 0) {
            BigDecimal[] qAndR = wholeCopy.divideAndRemainder(base);
            quotient = qAndR[0];
            remainder = qAndR[1];

            if (remainder.longValue() > 9) {
                this.result.append(ALPHABET.charAt((int) (remainder.longValue() - 10)));
            } else {
                this.result.append(remainder.longValue());
            }

            wholeCopy = quotient;
        }

        if (wholeCopy.longValue() > 9) {
            this.result.append(ALPHABET.charAt((int) (wholeCopy.longValue() - 10)));
        } else {
            this.result.append(wholeCopy.longValue());
        }
        // this.result.append(Integer.toHexString(quotient));
        this.result = this.result.reverse();
    }

    public static BigDecimal toDecimal(String data, int radius) {

        data = data.toUpperCase();

        String[] dataNumeric = data.split("\\.");

        int exponent = dataNumeric[0].length() - 1;
        BigDecimal bigDecimal = BigDecimal.ZERO;
        BigDecimal bigRadius = new BigDecimal(Integer.toString(radius));

        for (char c : data.toCharArray()) {
            if (c == '.') {
                continue;
            }

            BigDecimal digit = null;

            if (c <= '9') {
                digit = new BigDecimal(Integer.toString(c - '0'));
            } else {
                digit = new BigDecimal(Integer.toString(ALPHABET.charAt(c - 'A') - 'A' + 10));
            }

            if (exponent >= 0) {
                bigDecimal = bigDecimal.add(digit.multiply(bigRadius.pow(exponent)));
            } else {
                bigDecimal = bigDecimal.add(digit.divide(bigRadius.pow(exponent * (-1)), 6, RoundingMode.DOWN));
            }

            exponent--;
        }

        // System.out.println(bigDecimal);
        return bigDecimal;
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter two numbers in format: {source base} {target base} (To quit type /exit)");

            String option = scanner.nextLine();

            if (option.equals("/exit")) {
                break;
            } else {
                String[] data = option.split(" ");
                int source = Integer.parseInt(data[0]);
                int target = Integer.parseInt(data[1]);
                subMenu(scanner, source, target);
            }
        }
    }

    public static void subMenu(Scanner scanner, int source, int target) {
        while (true) {
            System.out.printf("Enter number in base %d to convert to base %d (To go back type /back) %n", source,
                    target);

            String option = scanner.nextLine();

            if (option.equals("/back")) {
                return;
            } else {
                // It is a number in any base.
                BigDecimal decimal = toDecimal(option, source);
                BaseConvertor main = new BaseConvertor(decimal, new BigDecimal(Integer.toString(target)));
                main.conversionWhole();
                main.conversionFraction();
                System.out.printf("Conversion result: %s %n", main.getResult());
            }
        }
    }

    public static void main(String[] args) {
        menu();
    }
}
