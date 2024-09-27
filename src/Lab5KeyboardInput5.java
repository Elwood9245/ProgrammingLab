import java.util.Scanner;

public class Lab5KeyboardInput5 {

    public static void summariseCircle(double radius) {
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("For a circle with radius: " + radius);
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        summariseCircle(radius);
        scanner.close();
    }
}