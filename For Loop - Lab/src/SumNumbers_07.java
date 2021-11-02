import java.util.Scanner;

public class SumNumbers_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countNumbers = Integer.parseInt(scanner.nextLine());//брой числата
        //всяко едно число от 1-вото до последното (countNumbers)

        //начална стойност: 1 (първото число)
        //крайна стойност: countNumbers (последното число)
        //промяна: + 1
        //повтаряме: четем стойност
        int sum = 0; //сумата от числата
        for (int number = 1; number <= countNumbers; number++) {
            int value = Integer.parseInt(scanner.nextLine());
            sum += value;
        }

        System.out.println(sum);
    }
}

