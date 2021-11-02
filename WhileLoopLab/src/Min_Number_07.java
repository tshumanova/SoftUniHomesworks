import java.util.Scanner;

public class Min_Number_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //повтарям: число под формата на текст -> число
        //спираме: вход == "Stop"
        //продължаваме: вход != "Stop"
        int min = Integer.MAX_VALUE;
        String input = scanner.nextLine(); //"Stop" или число под формата на текст
        while (!input.equals("Stop")) {
            //число под формата на текст -> "100"
            //текст -> число (parse)
            int number = Integer.parseInt(input);
            //проверка дали е макс
            if (number < min) {
                min = number;
            }

            input = scanner.nextLine();
        }
        System.out.println(min);

        /*int min = Integer.MAX_VALUE;
        for (String input = scanner.nextLine(); !input.equals("Stop"); input = scanner.nextLine()) {
            int number = Integer.parseInt(input);
            //проверка дали е макс
            if (number < min) {
                min = number;
            }
        }

        System.out.println(min);*/


    }
}
