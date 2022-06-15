public class Student {
    private String sid;
    private String preName;
    private String fName;
    private String lName;

    public Student(String sid, String preName, String fName, String lName) {
        this.sid = sid;
        this.preName = preName;
        this.fName = fName;
        this.lName = lName;
    }

    public String getLastname(){
        return this.lName;
    }

    public String getStudent(){
        String temp = "";
        
        for(int i = 2 ; i < 11 ; i++){
            temp += this.sid.charAt(i);
        }

        String returnString = String.format("%s  %-7s %s  %-20s",temp ,this.preName , this.fName , this.lName);

        return returnString ;
    }

}
