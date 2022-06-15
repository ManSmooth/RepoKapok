package Lab6_2.Department;

import java.util.ArrayList;

public class Staff extends Entry {
    private static ArrayList<Staff> staffs = new ArrayList<>();

    public String toString() {
        return String.format("%s staff%s", getPrefixString(getPosition()), super.toString());
    }

    public Staff(Position p) {
        setPosition(p);
        staffs.add(this);
    }

    public static ArrayList<Staff> getStaffs() {
        return staffs;
    }
}
