import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menuChicken = Integer.parseInt(scanner.nextLine());
        int menuFish = Integer.parseInt(scanner.nextLine());
        int menuVegatable = Integer.parseInt(scanner.nextLine());

        double chickenSum = menuChicken * 10.35;
        double fishSum = menuFish * 12.40;
        double vegatableSum = menuVegatable * 8.15;
        double sumyTotal =chickenSum +fishSum +vegatableSum;
        double sale=sumyTotal*0.20;
        double total =sumyTotal+sale+2.50;
        System.out.println(total);

    }
}
