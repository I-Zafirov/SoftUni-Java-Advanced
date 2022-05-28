package T07SetsAndMapsAdvanced.lab;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class L02SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> guests = new TreeSet<>();
        String reservationNumber = scanner.nextLine();

        while (!reservationNumber.equals("PARTY")) {
            guests.add(reservationNumber);

            reservationNumber = scanner.nextLine();
        }

        String guestReservations = scanner.nextLine();

        while (!guestReservations.equals("END")) {
            guests.remove(guestReservations);

            guestReservations = scanner.nextLine();
        }

        System.out.println(guests.size());
        System.out.println(String.join(System.lineSeparator(), guests));
    }
}
