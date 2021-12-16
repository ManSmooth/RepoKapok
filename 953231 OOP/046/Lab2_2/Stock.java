package Lab2_2;

public class Stock {
    private String symbol, name;
    private double previousClosingPrice, currentPrice;

    public Stock(String symbol, String name, double previousClosingPrice, double currentPrice) {
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    public double getChangePercent() {
        return (currentPrice / previousClosingPrice) * 100 - 100;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }
}
