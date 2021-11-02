import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishers = Integer.parseInt(scanner.nextLine());
        //  пролетта е 3000 лв.
        // Цената за наем на кораба през лятото и есента е 4200 лв.
        // Цената за наем на кораба през зимата е 2600 лв.
        double rent = 0.0;
        double discount = 0.0;

        //В зависимост от броя си групата ползва отстъпка:
        //Ако групата е до 6 човека включително – отстъпка от 10%.
        //Ако групата е от 7 до 11 човека включително – отстъпка от 15%.
        //Ако групата е от 12 нагоре – отстъпка от 25%.
        switch (season) {
            case "Spring":
                rent = 3000;
                if (fishers <= 6) {
                    discount = 0.10;
                } else if (fishers <= 11) {
                    discount = 0.15;
                } else {
                    discount = 0.25;
                }
                break;
            case "Summer":
            case "Autumn":
                rent = 4200;
                if (fishers <= 6) {
                    discount = 0.10;
                } else if (fishers <= 11) {
                    discount = 0.15;
                } else {
                    discount = 0.25;
                }
                break;
            case "Winter":
                rent = 2600;
                if (fishers <= 6) {
                    discount = 0.10;
                } else if (fishers <= 11) {
                    discount = 0.15;
                } else {
                    discount = 0.25;
                }
                break;
        }
        double needMoney = rent - rent * discount;
        if (fishers % 2 == 0 && !season.equals("Autumn")) {
            needMoney *= 0.95;
        }
        if (budget >= needMoney) {
            System.out.printf("Yes! You have %.2f leva left.", budget - needMoney);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.",needMoney-budget);
        }
    }
}
