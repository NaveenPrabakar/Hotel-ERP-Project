package Main.Guest;

public class KeyCard {

    private int roomnumber;
    boolean status;
    Guest owner;
    public KeyCard(int roomnumber, boolean status, Guest owner){
        this.roomnumber = roomnumber;
        this.status = status;
        this.owner = owner;
    }

    public int getRoomnumber() {
        return roomnumber;
    }

    public boolean getStatus(){
        return status;
    }

    public Guest getOwner(){
        return owner;
    }

    @Override
    public String toString(){
        return roomnumber + " " + status + " " + owner.getName();
    }
}
