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

    public static boolean checkBracket(String equation) {
        int openBracket = equation.indexOf("(");
        int endBracket = equation.indexOf(")");

        if (openBracket != -1) {
            if (endBracket != -1) {
                return true;
            } else {
                System.out.println("Error: Bracket not closed");
                return false;
            }
        } else {
            return false;
        }
    }

    public static int checkexponent(String equation) {
        return equation.indexOf("^");
    }

    public static int getBase(String equation, int expIndex) {
        String baseStr = "";
        for (int i = expIndex - 1; i > 0; i--) {
            if (equation.charAt(i) != '+' || equation.charAt(i) != '-' || equation.charAt(i) != '*' || equation.charAt(i) != '/' ||
            equation.charAt(i) != '(') {
                baseStr = equation.charAt(i) + baseStr;
            } else {
                break;
            }
        }

        int baseInt = Integer.parseInt(baseStr);

        return baseInt;
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

                if (checkBracket(equationTrim)) {
                    int openBracket = equationTrim.indexOf("(");
                    int endBracket = equationTrim.indexOf(")");
                    
                    String bracket = equationTrim.substring(openBracket, endBracket);

                    if (checkexponent(bracket) != -1) {
                        System.out.println(getBase(bracket, bracket.indexOf("^")));
                    }

                }

                loop = false;
            }
        }
    }
}