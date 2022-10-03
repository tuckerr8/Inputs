import java.util.Scanner;

public class C_to_F {
    public static void main(String[] args) {
        double celsius;
        double fahrenheit;
        String trash;

        // fahrenheit = (celsius * 9/5) + 32

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the temp for Celsius");

        if (in.hasNextDouble()) {
            celsius = in.nextDouble();
            in.nextLine();

            fahrenheit = Math.sqrt((celsius * 9) / 5 + 32);

            System.out.printf("The temp in Fahrenheit is: " + fahrenheit);

        } else {
            trash = in.nextLine();
            System.out.println("You entered an invalid with value");
            System.exit(0);
        }

    }
}

