import java.util.Scanner;

public class CoverterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter seconds: ");
        int seconds = scanner.nextInt();

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;

        System.out.println("Hours: " + hours + " Minutes: " + minutes + " Seconds: " + seconds % 60);

        scanner.close();
    }
}
