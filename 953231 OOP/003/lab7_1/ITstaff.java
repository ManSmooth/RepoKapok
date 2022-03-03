class ITstaff extends Employee{

    public ITstaff( String name , String org, int salary){
        super(name, org ,salary);
    }

    public void fixComputer() {
        System.out.println("Computer is fixed");
    }

    @Override public String sayHello(){
        return "Hello I'm IT staff From "+ super.getOrg() +" My name is " + super.getName() ;
    }
}
