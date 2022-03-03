class Stock{
    private String symbol ;
    private String name ;
    private double previousClosingPrice ;
    private double currentPrice ;
    
    public Stock(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
    }

    public void setPreviousClosingPrice(double x){
        this.previousClosingPrice = x ;
    }

    public void setCurrentPrice(double x){
        this.currentPrice = x ;
    }

    public double getChangePercent(){
        double diff = this.currentPrice - this.previousClosingPrice ;
        return (diff/ this.previousClosingPrice )*100 ;
    }

    public String getStockName(){
        return this.name + " " + this.symbol +" :";
    }

}