import java.util.Scanner;

public class RadiansToDegrees_02 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        double radians = Double.parseDouble(Scanner.nextLine());
        double degres = radians*180/ Math.PI;
        System.out.println(degres);
    }
}
