package Lab6_2.Department;

import java.util.ArrayList;

public class Manager extends Entry {
    
    private static ArrayList<Manager> managers = new ArrayList<>();
    
    public Manager(Position p) {
        setPosition(p);
        managers.add(this);
    }

    public String toString() {
        return String.format("%s manager%s", getPrefixString(getPosition()), super.toString());
    }

    public void plan() {
        System.out.println("Planning the operation.");
    }
    
    public void organize() {
        System.out.println("Organizing the department.");
    }

    public static ArrayList<Manager> getManagers() {
        return managers;
    }
}
