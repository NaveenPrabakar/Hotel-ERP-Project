package Main.Guest;

import Main.Booking.Reservation;

public class Guest {
    private String name;
    private int id;

    public Guest(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public int getid(){
        return id;
    }
}
