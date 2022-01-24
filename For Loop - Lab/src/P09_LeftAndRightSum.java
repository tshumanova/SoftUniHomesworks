import java.util.Scanner;

public class P09_LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;

        for (int i =1; i <=input ; i++) {
            int num1=Integer.parseInt(scanner.nextLine());
            sum1+=num1;
        }
        for (int i = 1; i <=input ; i++) {
            int num2=Integer.parseInt(scanner.nextLine());
            sum2+=num2;
        }
        int raz=Math.abs(sum1-sum2);
        if(sum1==sum2){
            System.out.printf("Yes, sum = %d",sum1);
        }else{
            System.out.printf(" No, diff = %d",raz);
        }
    }
}
