import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

public class ApartmentsLinkedList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Apartment> apartments = new LinkedList<>();

        System.out.println("Enter apartment information.");
        System.out.println("Type STOP as the street address to end input.\n");

        while (true) {
            System.out.print("Street Address (or STOP): ");
            String street = input.nextLine();

            if (street.equalsIgnoreCase("STOP"))
                break;

            System.out.print("Apartment Number: ");
            String aptNum = input.nextLine();

            System.out.print("Monthly Rent: ");
            double rent = Double.parseDouble(input.nextLine());

            System.out.print("Number of Bedrooms: ");
            int bed = Integer.parseInt(input.nextLine());

            apartments.add(new Apartment(street, aptNum, rent, bed));
            System.out.println("Apartment added!\n");
        }

        Collections.sort(apartments);

        System.out.println("\n===== Sorted Apartments by Rent =====");
        for (Apartment apt : apartments) {
            System.out.println(apt);
        }
    }
}
