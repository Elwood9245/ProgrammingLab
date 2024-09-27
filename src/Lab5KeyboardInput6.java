import java.util.Scanner;

public class Lab5KeyboardInput6 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your first name and age (e.g., 'Simon 123'):");
        String input = s.nextLine();
        Scanner t = new Scanner(input);

        String firstName = t.next();

        while (!t.hasNextInt())
            t.next();

        int age = t.nextInt();

        System.out.println("Name: " + firstName);
        System.out.println("Age: " + age);

        s.close();
        t.close();
    }
}
