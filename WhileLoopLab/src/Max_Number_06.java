import java.util.Scanner;

public class Max_Number_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //повтарям: число под формата на текст -> число
        //спираме: вход == "Stop"
        //продължаваме: вход != "Stop"
        /*int max = Integer.MIN_VALUE;
        String input = scanner.nextLine(); //"Stop" или число под формата на текст
        while (!input.equals("Stop")) {
            //число под формата на текст -> "100"
            //текст -> число (parse)
            int number = Integer.parseInt(input);
            //проверка дали е макс
            if (number > max) {
                max = number;
            }

            input = scanner.nextLine();
        }
        System.out.println(max);*/

        int max = Integer.MIN_VALUE;
        for (String input = scanner.nextLine(); !input.equals("Stop") ; input = scanner.nextLine()) {
            int number = Integer.parseInt(input);
            //проверка дали е макс
            if (number > max) {
                max = number;
            }
        }

        System.out.println(max);


    }
}
