import java.util.Scanner;

public class HotelRoom_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.ВХОД:
        //месец -> May, June, July, August, September или October
        //брой нощувки -> int
        //2. цена на нощувка -> спрямо месеца
        //3. отстъпки спрямо нощувки
        //4. изчисляваме цена за престой = бр.нощувки * цена за 1 нощувка
        //5. печатаме
        String month = scanner.nextLine();
        int countNights = Integer.parseInt(scanner.nextLine());

        double priceStudio = 0; //цена за 1 нощувка в студио
        double priceApartment = 0; //цена за 1 нощувка в апартамент

        //•   За апартамент, при повече от 14 нощувки, без значение от месеца : 10% намаление.
        switch (month) {
            case "May":
            case "October":
                priceStudio = 50;
                priceApartment = 65;
                if (countNights > 7 && countNights <= 14) {
                    priceStudio = priceStudio - 0.05 * priceStudio;
                } else if (countNights > 14) {
                    priceStudio = priceStudio - 0.30 * priceStudio;
                }
                break;
            case "June":
            case "September":
                priceStudio = 75.20;
                priceApartment = 68.70;
                if (countNights > 14) {
                    priceStudio = priceStudio * 0.80;
                }
                break;
            case "July":
            case "August":
                priceStudio = 76;
                priceApartment = 77;
                break;
        }


        if (countNights > 14) {
            priceApartment = priceApartment * 0.90;
            //priceApartment *= 0.90
        }

        //крайна цена за апаратамент
        double finalPriceApart = countNights * priceApartment;
        //крайна цена за студио
        double finalPriceStudio = countNights * priceStudio;

        System.out.printf("Apartment: %.2f lv.%n", finalPriceApart);
        System.out.printf("Studio: %.2f lv.", finalPriceStudio);


    }
}

