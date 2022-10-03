public class output {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(Math.PI);
        System.out.printf("%-10.2f%n",Math.PI);



        String firstName = "David";
        String lastName = "Troy";
        int age = 23;
        double salary = 100000;

        System.out.printf("%-15s %-15s %-15s %-15s%n", "First Name", "Last Name", "Age", "Salary");
        System.out.printf("%-15s %-15s %-15s %-15f%n", firstName, lastName, age, salary);
        System.out.printf("%-15s %-15s %-15s %-15f%n", firstName, lastName, age, salary);
        System.out.printf("%-15s %-15s %-15s %-15f%n", firstName, lastName, age, salary);
        System.out.printf("%-15s %-15s %-15s %-15f%n", firstName, lastName, age, salary);

        String firstname2 = "Rodzell";
        String lastname2 = "Tucker";
        //my name is Rodzell and my last name is Tucker

        System.out.printf("My first name is %s, my last name is %s", firstname2, lastname2);

    }
}
