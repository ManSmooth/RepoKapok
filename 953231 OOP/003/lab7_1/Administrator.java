class Administrator extends Employee {

    public Administrator( String name , String org, int salary){
        super(name, org ,salary);
    }

    public void checkSystem() {
        System.out.println("Checking system...");
    }

    @Override public String sayHello(){
        return "Hello I'm administrator From "+ super.getOrg() +" My name is " + super.getName() ;
    }

}