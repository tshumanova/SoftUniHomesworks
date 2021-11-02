import java.util.Scanner;

public class AccountBalance_05 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        //команда -> double или "NoMoreMoney"
        //повтарям: въвеждам команда
        //стоп: команда == "NoMoreMoney"
        //продължавам: команда != "NoMoreMoney"
        double totalSum = 0;
        String command = scanner.nextLine(); //начална стойност на командата
        while(!command.equals("NoMoreMoney")) {
            //command = "5.51" -> дробно число
            double sum = Double.parseDouble(command);
            if(sum < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f%n", sum);
            totalSum += sum;

            command = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", totalSum);
    }
}
