//642115003 Kan Katpark

class Student extends Person {
    
    private int status ;

    public Student(String name , String address , String phonenumber , String email, int status){
        super(name,address,phonenumber,email);

        this.status = status ;
    }

    @Override
    public String toString(){
        return "Student : " + super.getName() ;
    }

}
