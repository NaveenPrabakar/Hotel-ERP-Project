package Main.Employee;

public class Employee {
    private int StaffID;
    private String name;
    private String role;

    public Employee(int StaffID, String name, String role){
        this.StaffID = StaffID;
        this.name = name;
        this.role = role;
    }

    private int getId(){
        return StaffID;
    }

    public String getName(){
        return name;
    }

    public String role() {
        return role;
    }
}
