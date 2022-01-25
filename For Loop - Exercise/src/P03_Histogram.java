import java.util.Scanner;

public class P03_Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            //< 200
            //200 … 399
            //400 … 599
            //600 … 799
            //≥ 800
            if (number < 200) {
                p1 += 1;
            } else if (number <= 400) {
                p2 += 1;
            } else if (number <= 600) {
                p3 += 1;
            } else if (number < 800) {
                p4 += 1;
            } else {
                p5 += 1;
            }
        }

        System.out.printf("%.2f%%\n", p1 * 1.0 / n * 100);
        System.out.printf("%.2f%%\n", p2 * 1.0 / n * 100);
        System.out.printf("%.2f%%\n", p3 * 1.0 / n * 100);
        System.out.printf("%.2f%%\n", p4 * 1.0 / n * 100);
        System.out.printf("%.2f%%\n", p5 * 1.0 / n * 100);


    }
}
