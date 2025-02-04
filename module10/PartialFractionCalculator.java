import java.util.Scanner;

public class PartialFractionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Partial Fraction Decomposition Calculator");

        // Get the numerator and denominator from the user
        System.out.print("Enter the degree of the numerator: ");
        int numeratorDegree = scanner.nextInt();

        int[] numerator = new int[numeratorDegree + 1];
        System.out.println("Enter the coefficients of the numerator (highest to lowest degree): ");
        for (int i = 0; i <= numeratorDegree; i++) {
            numerator[i] = scanner.nextInt();
        }

        System.out.print("Enter the degree of the denominator: ");
        int denominatorDegree = scanner.nextInt();

        int[] denominator = new int[denominatorDegree + 1];
        System.out.println("Enter the coefficients of the denominator (highest to lowest degree): ");
        for (int i = 0; i <= denominatorDegree; i++) {
            denominator[i] = scanner.nextInt();
        }

        if (numeratorDegree >= denominatorDegree) {
            System.out.println("The numerator degree must be less than the denominator degree.");
            return;
        }

        System.out.println("Enter the linear factors of the denominator (e.g., for (x-2), enter 2): ");
        int[] factors = new int[denominatorDegree];
        for (int i = 0; i < denominatorDegree; i++) {
            factors[i] = scanner.nextInt();
        }

        // Calculate partial fractions
        double[] coefficients = new double[denominatorDegree];
        for (int i = 0; i < denominatorDegree; i++) {
            coefficients[i] = calculatePartialFraction(factors, numerator, i);
        }

        // Output the results
        System.out.println("Partial Fraction Decomposition:");
        for (int i = 0; i < denominatorDegree; i++) {
            System.out.printf("A%d/(x - %d) ", i + 1, factors[i]);
            if (i < denominatorDegree - 1) {
                System.out.print("+ ");
            }
        }
        System.out.println();
        for (int i = 0; i < denominatorDegree; i++) {
            System.out.printf("A%d = %.2f\n", i + 1, coefficients[i]);
        }
    }

    private static double calculatePartialFraction(int[] factors, int[] numerator, int index) {
        int factor = factors[index];

        // Substitute the factor into the numerator
        double result = 0;
        int degree = numerator.length - 1;
        for (int i = 0; i <= degree; i++) {
            result += numerator[i] * Math.pow(factor, degree - i);
        }

        // Multiply by the product of all other factors
        double product = 1;
        for (int i = 0; i < factors.length; i++) {
            if (i != index) {
                product *= (factor - factors[i]);
            }
        }

        return result / product;
    }
}
