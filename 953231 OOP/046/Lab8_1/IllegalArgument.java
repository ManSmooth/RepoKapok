package Lab8_1;

public class IllegalArgument {
    public static void main(String[] args) {
        Loan l = new Loan(-1, 100 ,1000);
        System.out.println(l);
    }
}
