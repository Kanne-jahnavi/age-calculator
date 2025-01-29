import java.util.Calendar;
import java.util.Scanner;

public class Agecalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        System.out.print("Enter your birth month (1-12): ");
        int birthMonth = scanner.nextInt();

        System.out.print("Enter your birth day (1-31): ");
        int birthDay = scanner.nextInt();

        Calendar birthDate = Calendar.getInstance();
        birthDate.set(birthYear, birthMonth - 1, birthDay);

        Calendar currentDate = Calendar.getInstance();

        int age = currentDate.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);

        if (currentDate.get(Calendar.MONTH) < birthDate.get(Calendar.MONTH) ||
                (currentDate.get(Calendar.MONTH) == birthDate.get(Calendar.MONTH) &&
                        currentDate.get(Calendar.DAY_OF_MONTH) < birthDate.get(Calendar.DAY_OF_MONTH))) {
            age--;
        }

        System.out.println("Your age is: " + age + " years old.");
    }
}


