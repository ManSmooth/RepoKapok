class Employee {
    private String name ;
    private String org ;
    private int salary;

    public Employee(String name , String org, int salary){
        this.name = name ;
        this.org = org ;
        this.salary = salary ;
    }

    public String sayHello(){
        return "Hello I'm"  + getClass() + " From "+ this.org +" My name is " + this.name ; 
    }

    public String getName() {
        return this.name ;
    }

    public String getOrg() {
        return this.org ;
    }

    public int getSalary(){
        return this.salary ;
    }

}

