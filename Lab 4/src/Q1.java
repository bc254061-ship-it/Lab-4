import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter type of park (Theme Park / Water Park / Both Parks): ");
        String typeOfPark = scan.nextLine().trim();

        double ticketCharge;

        if (age < 0) {
            System.out.println("Invalid Age");
            scan.close();
            return;
        }

        if (age == 55) {
            System.out.println("Ticket charge for age 55 is not specified.");
            scan.close();
            return;
        }

        if (typeOfPark.equalsIgnoreCase("Theme Park")) {

            if (age > 55) {
                ticketCharge = 10;
            }
            else if (age >= 21) {
                ticketCharge = 25;
            }
            else if (age >= 13) {
                ticketCharge = 20;
            }
            else if (age >= 3) {
                ticketCharge = 10;
            }
            else {
                ticketCharge = 0;
            }
        }
        else if (typeOfPark.equalsIgnoreCase("Water Park")) {

            if (age > 55) {
                ticketCharge = 15;
            }
            else if (age >= 21) {
                ticketCharge = 30;
            }
            else if (age >= 13) {
                ticketCharge = 25;
            }
            else if (age >= 3) {
                ticketCharge = 15;
            }
            else {
                ticketCharge = 7;
            }
        }
        else if (typeOfPark.equalsIgnoreCase("Both Parks")) {

            if (age > 55) {
                ticketCharge = 20;
            }
            else if (age >= 21) {
                ticketCharge = 45;
            }
            else if (age >= 13) {
                ticketCharge = 40;
            }
            else if (age >= 3) {
                ticketCharge = 20;
            }
            else {
                ticketCharge = 5;
            }
        }
        else {
            System.out.println("Invalid Type of Park");
            scan.close();
            return;
        }

        System.out.println("----------------------------------------");
        System.out.println("Age: " + age);
        System.out.println("Type of park: " + typeOfPark);
        System.out.printf("Ticket charge: RM%.2f%n", ticketCharge);

        scan.close();
    }
}