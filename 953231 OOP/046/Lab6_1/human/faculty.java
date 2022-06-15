package Lab6_1.human;

public class faculty extends employee {
    private String rank;
    private String officeHour;

    public faculty(String s, double d, String r, String o) {
        super(s, d);
        rank = r;
        officeHour = o;
    }

    public String toString() {
        return String.format("faculty(%s) @%s($%.2f/Month)\n(%s)\nname: %s\naddress: %s\nemail: %s\nphone: %s",
                rank, getOffice(), getSalary(), officeHour, name, address, emailAddress, phone);
    }

    public String getRank() {
        return rank;
    }

    public String getOfficeHour() {
        return officeHour;
    }
}
