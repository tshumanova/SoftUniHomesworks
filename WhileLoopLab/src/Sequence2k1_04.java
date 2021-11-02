import java.util.Scanner;

public class Sequence2k1_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        //начална стойност: 1
        //крайна стойност: n
        //повтаряме: печатаме
        //промяна: * 2 + 1

        int number = 1;
        while (number <= n) {
            System.out.println(number);
            number = number * 2 + 1;
        }
    }
}
