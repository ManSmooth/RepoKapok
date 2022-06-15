package Lab2_2;

public class Stock_main {
    public static void main(String[] args) {
        Stock ORCL = new Stock("ORCL", "Oracle Corporation", 34.5, 34.35);
        System.out.printf("[%s] %s: %.2f%%", ORCL.getSymbol(), ORCL.getName(), ORCL.getChangePercent());
    }
}
