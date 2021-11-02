import java.util.Scanner;

public class VacationBooksList_04{
        public static void main(String[] args) {
            Scanner Scan = new Scanner(System.in);
            int pageBook = Integer.parseInt(Scan.nextLine());
            int page = Integer.parseInt(Scan.nextLine());
            int day = Integer.parseInt(Scan.nextLine());
            int readBook = pageBook / page;
            int readDay = readBook / day;
            System.out.println(readDay);


        }
}
