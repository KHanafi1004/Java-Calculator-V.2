import java.util.Scanner;

public class Calculator {
    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        return x / y;
    }

    public static double exponential(int x, int y) {
        return Math.pow(x, y);
    }

    public static int factorial(int x) {
        if (x > 1) {
            return x * factorial(x - 1);
        } else {
            return 1;
        }
    }

    public static double modulo(int x, int y) {
        return x % y;
    }

    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {

            boolean loop = true;

            while (loop) {
                System.out.println("Please input the equation you wish to calculate. Note that only the following symbols can be used:");
                System.out.println("\n+");
                System.out.println("\n-");
                System.out.println("\n*");
                System.out.println("\n/");
                System.out.println("\n^");
                System.out.println("\n()");
                System.out.println("\n!");
                System.out.println("\n%");
                System.out.println("");

                String equation = in.nextLine();

                String equationTrim = equation.replaceAll(" ", "");

                

                System.out.println(equationTrim);

                loop = false;
            }
        }
    }
}