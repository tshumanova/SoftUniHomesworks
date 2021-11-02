import java.util.Scanner;

public class DepositCalculator_03 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        double depozit = Double.parseDouble(Scan.nextLine());
        int mounthly = Integer.parseInt(Scan.nextLine());
        double procent = Double.parseDouble(Scan.nextLine());
        double sumMounthly = depozit * ((procent / 100) / 12);
        double sum = depozit + mounthly * sumMounthly;
        System.out.println(sum);

    }
}
