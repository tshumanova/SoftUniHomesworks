import java.util.Scanner;

public class OperationsBetweenNumbers_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();
        int resolt = 0;
        //„{N1} {оператор} {N2} = {резултат} – {even/odd}“

        if ("+".equals(symbol) || "-".equals(symbol) || "*".equals(symbol)) {
            if ("+".equals(symbol)) {
                resolt = N1 + N2;
                if (resolt % 2 == 0) {
                    System.out.printf("%d %s %d = %d - even", N1, symbol, N2, resolt);
                } else {
                    System.out.printf("%d %s %d = %d - odd", N1, symbol, N2, resolt);
                }
            } else if ("-".equals(symbol)) {
                resolt = N1 - N2;
                if (resolt % 2 == 0) {
                    System.out.printf("%d %s %d = %d - even", N1, symbol, N2, resolt);
                } else {
                    System.out.printf("%d %s %d = %d - odd", N1, symbol, N2, resolt);
                }
            } else if ("*".equals(symbol)) {
                resolt = N1 * N2;
                if (resolt % 2 == 0) {
                    System.out.printf("%d %s %d = %d - even", N1, symbol, N2, resolt);
                } else {
                    System.out.printf("%d %s %d = %d - odd", N1, symbol, N2, resolt);
                }
            }
        } else if ("/".equals(symbol)) {
            if (N2 == 0) {
                System.out.printf("Cannot divide %d by zero", N1);
            } else {
                    double rest = N1 * 1.0 / N2;
                    System.out.printf("%d %s %d = %.2f", N1, symbol, N2, rest);
                }

        } else if ("%".equals(symbol)) {
                    if (N2 == 0) {
                        System.out.printf("Cannot divide %d by zero", N1);
                    } else {
                        double res = N1 % N2;
                        System.out.printf("%d %s %d = %.0f", N1, symbol, N2, res);
                    }
                }
            }
        }
