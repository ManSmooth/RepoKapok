class Janitor extends Employee {
        
    public Janitor( String name , String org, int salary){
        super(name, org ,salary);
    }

    public void doCleaning() {
        System.out.println("The room is cleaned");
    }

    @Override public String sayHello(){
        return "Hello I'm janitor From "+ super.getOrg() +" My name is " + super.getName() ;
    }
}
