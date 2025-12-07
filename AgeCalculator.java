import java.time.LocalDate;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int year = sc.nextInt();

        int currentYear = LocalDate.now().getYear();
        int age = currentYear - year;

        System.out.println("Your age is: " + age);
    }
}
