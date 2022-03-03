import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class Student {
    private String SID ;
    private String first_name ;
    private String last_name ;
    private Vector<Vaccine> vacc_list ;

    public Student(String SID , String first_name , String last_name) {
        this.SID = SID ;
        this.first_name = first_name ;
        this.last_name = last_name ;
        this.vacc_list = new Vector<Vaccine>();
    }

    public Student(String SID , String first_name , String last_name, Vector<Vaccine> vacc_list) {
        this.SID = SID ;
        this.first_name = first_name ;
        this.last_name = last_name ;
        this.vacc_list =  vacc_list ;
    }

    public String toString() {
        String studentInfo = String.format("SID : %-9s Name: %-10s  %-10s", this.SID , this.first_name , this.last_name) ;
        return  studentInfo +" Vaccine List: " + getVaccList() ;
    }

    public String getSID() {
        return this.SID ;
    }

    public String getVaccList() {
        String temp = "" ;
        for(Vaccine v : vacc_list ){
            temp += v.toString() ;
        }
        return temp ;
    }

}

class Vaccine {
    private String vacc;
    private Date date ;

    public Vaccine(String vacc , Date date) {
        this.vacc = vacc ;
        this.date = date ;
    }
    
    public Vaccine(String vacc) {
        this.vacc = vacc ;
        this.date = new Date() ;
    }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String temp = String.format("%-7s [%s] ", this.vacc, sdf.format(this.date));
        return temp ;
    }
}
