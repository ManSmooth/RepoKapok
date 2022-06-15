package Lab6_2.Department;

public abstract class Entry {
    private String name;
    private String address;
    private String email;
    private double Salary;
    private Position position;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public void Init(String s, String a, String e, double sa) {
        name = s;
        address = a;
        email = e;
        Salary = sa;
    }

    public void work() {
        System.out.printf("Worked@%s and got $%.2f\n", getPrefixString(position), Salary);
    }

    public String toString() {
        return String.format("\n($%.2f/Month)\n%s\n%s\n%s", Salary, name, address, email);
    }

    public static String getPrefixString(Position p) {
        switch (p) {
            case GENERAL:
                return "General";
            case PRODUCTION:
                return "Production";
            case OFFICE:
                return "Office";
            case SALES:
                return "Sales and Service";
            case ACCOUNTING:
                return "Accounting and Billing";
            default:
                return "";
        }
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
