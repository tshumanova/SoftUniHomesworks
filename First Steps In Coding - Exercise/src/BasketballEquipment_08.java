import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int annualFee = Integer.parseInt(scanner.nextLine());

        double sneakers = annualFee - annualFee * 0.40;
        double outfit = sneakers - sneakers * 0.20;
        double ball = outfit / 4;
        double accessories = ball / 5;

        double totalSum = sneakers + outfit + ball + accessories + annualFee;
        System.out.println(totalSum);
    }
}
