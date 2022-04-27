package co.edu.utadeo;

public class App {
    public static void main(String[] args) {
        double pi = 0;

        for (int i = 1; i <= 400_000_000; i += 10_000_000) {
            double variablePart = 0;
            for (int j = 1; j <= i; j++) {
                variablePart += (Math.pow(-1, j + 1) / ((2 * j) - 1));
            }
            pi = 4 * variablePart;
            System.out.printf("For i = %d\npi = %12.9f\n", i, pi);
        }
    }

}
