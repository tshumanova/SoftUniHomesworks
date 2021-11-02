import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double buget = Double.parseDouble(scanner.nextLine());
        String seoson = scanner.nextLine();
        double destination = 0;
        double camp = 0;
        double hotel = 0;

        if (buget <= 100) {
            if ("summer".equals(seoson)) {
                camp = buget * 0.30;
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("Camp - %.2f", camp);
            } else if ("winter".equals(seoson)) {
                hotel = buget * 0.70;
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("Hotel - %.2f", hotel);
            }
        } else if (buget <= 1000) {
            if ("summer".equals(seoson)) {
                camp = buget * 0.40;
                System.out.println("Somewhere in Balkans");
                System.out.printf("Camp - %.2f", camp);
            } else if ("winter".equals(seoson)) {
                hotel = buget * 0.80;
                System.out.println("Somewhere in Balkans");
                System.out.printf("Hotel - %.2f", hotel);
            }
        } else if (buget > 1000) {
            hotel = buget * 0.90;
            System.out.println("Somewhere in Europe");
            System.out.printf("Hotel - %.2f", hotel);
        }
    }
}
