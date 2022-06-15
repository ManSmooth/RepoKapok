//642115003 Kan Katpark

class Staff extends Employee{
    private String title ;

    public Staff(String name , String address , String phonenumber , String email,String office , int salary, String title ){
        super(name, address, phonenumber, email, office, salary) ;
        this.title = title ;
    }

    @Override
    public String toString() {
        return "Staff : "+ super.getName() ; 
    }
}
