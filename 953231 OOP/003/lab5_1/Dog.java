// 642115003 Kan Katpark
class Dog {
    private String name ;
    private int age ;

    public Dog(String name , int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age ;
    }

    public int getHumanAge(){
        return this.age * 7 ;
    }

    public void setAge(int age){
        this.age = age;
    }
    
    public void setName(String name){
        this.name = name ;
    }

    public String toString(){
        String temp = String.format("Dog name : %s \nDog age : %d \nHuman age : %d",getName(),getAge(),getHumanAge() );
        return temp;
    }

}