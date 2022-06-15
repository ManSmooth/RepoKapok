//642115003 Kan Katpark
public class StockTest {
    public static void main(String[] args) {
        Stock oracle = new Stock("ORCL","Oracle Corporation");
        oracle.setPreviousClosingPrice(34.5);
        oracle.setCurrentPrice(34.35);

        System.out.printf("%s %.3f%%", oracle.getStockName(),oracle.getChangePercent());
    }
}
