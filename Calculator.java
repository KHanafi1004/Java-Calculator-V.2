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

            int openBracket = 0;
            int closeBracket = 0;

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

                openBracket = equationTrim.indexOf("(");
                closeBracket = equationTrim.indexOf(")");

                if (openBracket != -1) {
                    if (closeBracket != -1) {
                        String bracket = equationTrim.substring(openBracket + 1, closeBracket);
                        System.out.println(bracket);
                        break;

                    }
                }
                
                System.out.println(equationTrim);

                loop = false;
            }
        }
    }
}