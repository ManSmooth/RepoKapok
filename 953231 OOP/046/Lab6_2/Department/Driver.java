package Lab6_2.Department;

public class Driver {
    public static void main(String[] args) {
        Manager M = new Manager(Position.GENERAL);
        M.Init("John Doe", "19/2 Sunset Valley", "JohnD@email.com", 50000);
        System.out.println(M);
        M.plan();
        M.organize();
        M.work();

        Staff A = new Staff(Position.GENERAL);
        A.Init("Jane Doe", "12/1 Sunset Valley", "JD@amail.com", 1000);
        System.out.println(A);
        A.work();
    }
}
