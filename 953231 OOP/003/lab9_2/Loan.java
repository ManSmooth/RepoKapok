//642115003 Kan Katpark

public class Loan {

    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    /**
     * Default constructor
     */
    public Loan() {
        this(2.5, 1, 1000);
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        if(annualInterestRate <= 0){
            IllegalAccessError err = new IllegalAccessError("Annual InterestRate must be positive") ;
            throw  err;
        }
        if(numberOfYears <= 0 ){
            IllegalAccessError err = new IllegalAccessError("Number Of Years must be positive") ;
            throw  err;
        }
        if(loanAmount <= 0 ){
            IllegalAccessError err = new IllegalAccessError("Loan Amount must be positive") ;
            throw  err; 
        }
        
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    /* Return annualInterestRate */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    
    /** Set a new annualInterestRate */
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    
    /** Return numberOfYears */
    public int getNumberOfYears(){
        return numberOfYears;
    }
    
    /** Set a new numberOfYears */
    public void setNumberOfYears(int numberOfyears){
        this.numberOfYears = numberOfyears;
    }
    
    /** Return loanAmount */
    public double getLoanAmount(){
        return loanAmount;
    }
    
    /** Set a new loanAmount */
    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }
    
    /** Find monthly payment */
    public double getMonthlyPayment(){
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1/Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyInterestRate;
    }
    
    /** Find total payment */
    public double getTotalPayment(){
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }
    
    public java.util.Date getLoanDate(){
        return loanDate;
    }
}
