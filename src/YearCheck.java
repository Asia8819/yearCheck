import java.util.Scanner;

public class YearCheck {

    boolean isLeap(Scanner scanner) {

        System.out.println("Podaj rok");
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}


