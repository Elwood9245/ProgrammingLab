import java.util.Scanner;

public class Lab5KeyboardInput7 {

    public static int realAge(int year, int month, int day){
        int currentYear = 2024;
        int currentMonth = 9;
        int currentDate = 27;

        if ((currentMonth > month) || ((currentMonth == month) && (currentDate >= day)))
            return currentYear - year;
        else
            return currentYear - year - 1;
    }

    public static void main(String[] args) {
        System.out.println("Please enter your name:");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();

        System.out.println("Hi " + name);
        System.out.println("In what year were you born? (e.g.2001)");
        int year = s.nextInt();

        System.out.println("In what month were you born? (e.g.05)");
        int month = s.nextInt();

        System.out.println("In what day were you born? (e.g.03)");
        int day = s.nextInt();

        int age = realAge(year, month,day);
        System.out.println("Your age is " + age);

    }

}
