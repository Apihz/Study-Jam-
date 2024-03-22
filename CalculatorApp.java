import java.util.Scanner;
public class CalculatorApp{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the height number: ");
        double height = scanner.nextDouble();
        System.out.println("Enter the base number: ");
        double base = scanner.nextDouble();

        double area = 0.5 * height * base;

        System.out.println("The area of the triangle is: " + area);

        scanner.close();
    }
}