import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());

        int daysCounter = 0;
        int spendingCounter = 0;
        while (currentMoney < neededMoney && spendingCounter < 5) {
            String text = scanner.nextLine();
            double totalSum = Double.parseDouble(scanner.nextLine());
            daysCounter++;

            if (text.equals("spend")) {
                currentMoney -= totalSum;
                spendingCounter++;
                if (currentMoney < 0) {
                    currentMoney = 0;
                }
            } else if (text.equals("save")) {
                currentMoney += totalSum;
                spendingCounter = 0;
            }
        }
        if (spendingCounter == 5) {
            System.out.printf("You can't save the money.\n%d", daysCounter);
        }
        if (currentMoney >= neededMoney) {
            System.out.printf("You saved the money for %d days.", daysCounter);
        }
    }
}
