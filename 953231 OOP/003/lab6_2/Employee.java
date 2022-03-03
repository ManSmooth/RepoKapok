//642115003 Kan Katpark

class Employee extends Person {
    
    private String office;
    private int salary ;

    public Employee(String name , String address , String phonenumber , String email, String office , int salary){
        super(name,address,phonenumber,email);

        this.office = office ;
        this.salary = salary ;
    }


}
