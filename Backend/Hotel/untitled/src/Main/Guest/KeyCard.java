package Main.Guest;

import Main.Room.room;

public class KeyCard implements KeyCardInterface {

    private int roomnumber;
    Boolean status;
    Guest owner;
    public KeyCard(int roomnumber, Boolean status, Guest owner){
        this.roomnumber = roomnumber;
        this.status = status;
        this.owner = owner;
    }

    public int getRoomnumber() {
        return roomnumber;
    }

    public Boolean getStatus(){
        return status;
    }

    public Guest getOwner(){
        return owner;
    }

    @Override
    public String toString(){
        return roomnumber + " " + status + " " + owner.getName();
    }

    public String addToPastToString() { return roomnumber + " " + owner.getName();}
}
