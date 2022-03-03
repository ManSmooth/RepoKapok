public class Student{
    private String sid ;
    private String fname ;
    private String lname ;

    public Student(String sid, String fname, String lname){
        this.sid = sid;
        this.fname = fname;
        this.lname = lname;
    }

    public String getSID(){
        return this.sid ;
    }

    public String getFname(){
        return this.fname ;
    }

    public String getLname(){
        return this.lname ;
    }
    
}
