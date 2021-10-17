import java.util.Scanner;

public class YearTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        YearCheck yearCheck = new YearCheck();
        boolean checkingYear = yearCheck.isLeap(scanner);
        System.out.println(checkingYear);

    }
}
