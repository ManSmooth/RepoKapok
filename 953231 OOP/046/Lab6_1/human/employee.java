package Lab6_1.human;

public class employee extends person {
    private double salary;
    private String office;

    public employee(String s, double d) {
        super();
        office = s;
        salary = d;
    }

    public String toString() {
        return String.format("employee @%s($%.2f/Month)\nname: %s\naddress: %s\nemail: %s\nphone: %s",
                office, salary, name, address, emailAddress, phone);
    }

    public String getOffice() {
        return office;
    }
    public double getSalary() {
        return salary;
    }
}
