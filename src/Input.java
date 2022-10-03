import java.util.Scanner;
public class Input {

    public static void main(String[] args) {
        /*
        String firstName;
        String lastName;
        int dayOfBirth;
        int monthOfBirth;
        int yearOfBirth;
        double salary;

        //Scanner object for receiving inputs
        Scanner in = new Scanner(System.in);

        System.out.println("What is your first name?");
        firstName = in.nextLine();

        System.out.println("What is your last name?");
        lastName = in.nextLine();

        System.out.println("What is your day of birth?");
        dayOfBirth = in.nextInt();

        System.out.println("What is your month of birth?");
        monthOfBirth = in.nextInt();

        System.out.println("What is your year of birth?");
        yearOfBirth = in.nextInt();

        System.out.println("What is your salary?");
        salary= in.nextDouble();

        System.out.println();
        System.out.println("Your first name is " + firstName);
        System.out.println("Your last name is " + lastName);
        System.out.println("Your month of birth is " + monthOfBirth);
        System.out.println("Your day of birth is " + dayOfBirth);
        System.out.println("Your year of birth is " + yearOfBirth);
        System.out.println("Your salary is: " + salary);
        System.out.println("End of Line");
        */

        String firstName = "";
        String lastName = "";
        int dayOfBirth = 0;
        int monthOfBirth = 0;
        int yearOfBirth = 0;
        double salary = 0;

        //Scanner object for receiving inputs
        Scanner in = new Scanner(System.in);

        System.out.println("What is your first name?");
        if(in.hasNext()){
            firstName = in.nextLine();
            in.nextLine();
        } else {
            System.out.println("You have entered an invalid name");
            in.nextLine();
        }

        System.out.println("What is your last name?");
        if(in.hasNext()) {
            lastName = in.nextLine();
            in.nextLine();
        } else {
            System.out.println("You entered an invalid name");
            in.nextLine();
        }

        System.out.println("What is your day of birth?");
        if(in.hasNextInt()){
            dayOfBirth = in.nextInt();
            in.nextLine();
        } else {
            System.out.println("You have entered an invalid day of birth");
            in.nextLine(); //Clears out the buffer
        }

        System.out.println("What is your month of birth?");
        if ((in.hasNextInt())){
            monthOfBirth = in.nextInt();
            in.nextLine();
        } else {
            System.out.println("You entered an invalid month of birth");
        }

        System.out.println("What is your year of birth?");
        if(in.hasNextInt()) {
            yearOfBirth = in.nextInt();
            in.nextLine();
        } else {
            in.nextLine();
            System.out.println("You entered an invalid year of birth: " );
        }

        System.out.println("What is your salary?");
        if(in.hasNextDouble()){
            salary = in.nextDouble();
            in.nextLine();
        } else {
            System.out.print("You entered an invalid salary");
            in.nextLine();
        }

        System.out.println();
        System.out.println("Your first name is " + firstName);
        System.out.println("Your last name is " + lastName);
        System.out.println("Your month of birth is " + monthOfBirth);
        System.out.println("Your day of birth is " + dayOfBirth);
        System.out.println("Your year of birth is " + yearOfBirth);
        System.out.println("Your salary is: " + salary);
        System.out.println("End of Line");

    }
}
