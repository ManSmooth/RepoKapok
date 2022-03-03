class Receptionist extends Employee {

    public Receptionist( String name , String org, int salary){
        super(name, org ,salary);
    }

    public void sayGreeting() {
        System.out.println("Welcome to " + super.getOrg());
    }

    @Override public String sayHello(){
        return "Hello I'm receptionist From "+ super.getOrg() +" My name is " + super.getName() ;
    }
   
}
