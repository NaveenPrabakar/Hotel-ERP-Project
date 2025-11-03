package Main.Guest;

import Main.Employee.*;
import java.util.*;
import Main.Booking.*;

public class CheckSystemController {
    public static void RunCheckin(Employee frontDesk){
        System.out.println("===== HOTEL CHECK-IN SYSTEM =====");
        System.out.println("Hi, I am " + frontDesk.getName() + ", Can you provide your name?");

        boolean process = true;
        Scanner scnr = new Scanner(System.in);

        while(process){
            String name = scnr.nextLine();
            System.out.println("Okay, and could you provide your id please?");
            int id = scnr.nextInt();

            Guest guest = new Guest(name, id);
            //Downcast to use FrontDesk
            boolean check = ((FrontDesk) frontDesk).verifyIdentity(guest);

            if(check){
                System.out.println("Thank you. Give me a moment to verify your reservation");
                Reservation reserve = ((FrontDesk) frontDesk).verifyCheckIn(guest);
                System.out.println();
                System.out.println("Thanks for waiting, you have a reservation from " + reserve.getStartDate() + " to " + reserve.getEndDate());
                System.out.println();
                ((FrontDesk) frontDesk).provideKeyCard(Integer.parseInt(reserve.getRoomNumber()), guest);
                System.out.println();
                System.out.println("Here is your keycard for room " + reserve.getRoomNumber() );
                break;
            }
            System.out.println("Sorry sir, you can't verify your identity");
            break;

        }

        scnr.close();
    }
}
