import java.util.Scanner;

public class P08_NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= input; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if(number>max){
                max=number;
            }
            if(number<min){
                min=number;
            }
        }
        System.out.printf("Max number: %d\n" + "Min number: %d\n",max,min);
    }
}
