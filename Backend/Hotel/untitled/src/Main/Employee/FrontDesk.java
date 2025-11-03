package Main.Employee;
import Main.Guest.*;
import Main.Booking.*;

public interface FrontDesk {
    public Reservation verifyCheckIn(Guest guest);
    public boolean verifyIdentity(Guest guest);
    public void provideKeyCard(int roomnumber, Guest owner);
    public boolean verifyCheckOut();
    public void revokeKeyCard();
}
