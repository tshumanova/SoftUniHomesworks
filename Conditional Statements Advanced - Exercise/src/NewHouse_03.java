import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowers = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        int buget = Integer.parseInt(scanner.nextLine());

        double price = 0.0;
        double totalPrice = 0.0;

        if ("Roses".equals(flowers)) {
            if (countFlowers > 80) {
                price = (5 * countFlowers) - (5 * countFlowers * 0.10);

            } else {
                price = 5 * countFlowers;

            }
        } else if ("Dahlias".equals(flowers)) {
            if (countFlowers > 90) {
                price = (3.80 * countFlowers) - (3.80 * countFlowers * 0.15);

            } else {
                price = 3.80 * countFlowers;

            }
        } else if ("Tulips".equals(flowers)) {
            if (countFlowers > 80) {
                price = (2.80 * countFlowers) - (2.80 * countFlowers * 0.15);

            } else {
                price = 2.80 * countFlowers;

            }
        } else if ("Narcissus".equals(flowers)) {
            if (countFlowers <120) {
                double learns = 3 * 0.15 + 3;
                price = countFlowers * learns;

            } else {
                price = 3 * countFlowers;

            }
        } else if ("Gladiolus".equals(flowers)) {
            if (countFlowers <80) {
                double learns = 2.5 * 0.20 + 2.5;
                price = learns * countFlowers;

            } else {
                price = 2.5 * countFlowers;

            }
        }
        totalPrice = buget - price;


        if (price <= buget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers, flowers, totalPrice);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(totalPrice));
        }
    }
}