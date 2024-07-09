package IntegerArthemetic;

import java.math.BigDecimal;

public class ComplexFloatingPointArithmetic {
    public static void main(String[] args) {
        // Basic Operations
        double a = 0.1;
        double b = 0.2;
        double sum = a + b;
        double difference = b - a;
        double product = a * b;
        double quotient = b / a;

        System.out.println("Sum: " + sum); // Expected 0.3, but might print 0.30000000000000004
        System.out.println("Difference: " + difference); // Expected 0.1, but might print 0.1
        System.out.println("Product: " + product); // Expected 0.02, but might print 0.020000000000000004
        System.out.println("Quotient: " + quotient); // Expected 2.0, but might print 2.0000000000000004

        // Comparing Floating Point Numbers
        double expectedSum = 0.3;
        double epsilon = 1e-10;

        if (Math.abs(sum - expectedSum) < epsilon) {
            System.out.println("The sum is close enough to 0.3!");
        } else {
            System.out.println("The sum is not equal to 0.3.");
        }

        // Handling Precision with BigDecimal
        BigDecimal bigA = new BigDecimal("0.1");
        BigDecimal bigB = new BigDecimal("0.2");
        BigDecimal bigSum = bigA.add(bigB);

        System.out.println("BigDecimal Sum: " + bigSum); // Will print 0.3

        BigDecimal bigC = new BigDecimal("1.0");
        BigDecimal bigD = new BigDecimal("3.0");
        BigDecimal bigQuotient = bigC.divide(bigD, 10, BigDecimal.ROUND_HALF_UP); // 10 decimal places

        System.out.println("BigDecimal Division: " + bigQuotient); // Will print 0.3333333333

        // Accumulated Rounding Error
        double accumulatedSum = 0.0;
        for (int i = 0; i < 1000; i++) {
            accumulatedSum += 0.1;
        }
        System.out.println("Accumulated Sum: " + accumulatedSum); // Expected 100.0, but might print 99.9999999999986

        // More Complex Operations
        double largeNumber = 1e16;
        double smallNumber = 1.0;
        double complexSum = largeNumber + smallNumber;

        System.out.println("Complex Sum: " + complexSum); // Expected 1e16 + 1, but might print 1e16 due to precision loss

        double preciseNumber = 123456789.123456789;
        double roundedNumber = Math.round(preciseNumber * 1e8) / 1e8;

        System.out.println("Rounded Number: " + roundedNumber); // Expected 123456789.12345679

        // Mixing BigDecimal and double
        double doubleValue = 1.23456789;
        BigDecimal mixedBigDecimal = new BigDecimal(Double.toString(doubleValue));

        System.out.println("Mixed BigDecimal: " + mixedBigDecimal); // Will print 1.23456789

        // Using Math functions with floating point numbers
        double sqrtValue = Math.sqrt(2.0);
        double powValue = Math.pow(2.0, 10.0);
        double expValue = Math.exp(1.0);
        double logValue = Math.log(10.0);

        System.out.println("Square Root of 2: " + sqrtValue); // Expected 1.4142135623730951
        System.out.println("2 to the power of 10: " + powValue); // Expected 1024.0
        System.out.println("Exponential of 1: " + expValue); // Expected 2.718281828459045
        System.out.println("Natural log of 10: " + logValue); // Expected 2.302585092994046
    }
}

