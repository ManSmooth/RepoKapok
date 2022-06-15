//642115003 Kan Katpark

class Faculty extends Employee{

    private int officeHour ;
    private String rank ;

    public Faculty(String name , String address , String phonenumber , String email, String office , int salary, int officeHour , String rank){
        super(name, address, phonenumber, email, office, salary);

        this.officeHour = officeHour ;
        this.rank = rank ;

    }

    @Override
    public String toString(){
        return "Faculty : " + super.getName() ;
    }
    
}
