import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int pieces = width * length;
        boolean isFinished = false;
        // командата "STOP" или докато не свърши тортата
        String input = scanner.nextLine();
        while (!input.equals("STOP")) {
            int currentPieces = Integer.parseInt(input);
            pieces -= currentPieces;
            if (pieces <= 0) {
                isFinished = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (isFinished) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(pieces));
        } else {
            System.out.printf("%d pieces are left.", pieces);
        }
    }
}
