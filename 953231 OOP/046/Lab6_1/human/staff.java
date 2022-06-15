package Lab6_1.human;

public class staff extends employee {
    private String title;

    public staff(String s, double d, String t) {
        super(s, d);
        title = t;
    }

    public String toString() {
        return String.format("staff(%s) @%s($%.2f/Month)\nname: %s\naddress: %s\nemail: %s\nphone: %s",
                title, getOffice(), getSalary(), name, address, emailAddress, phone);
    }

    public String getTitle() {
        return title;
    }
}
