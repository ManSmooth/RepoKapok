import java.io.*;
import java.util.*;

class Student{
    private String firstName;
    private String lastName;
    
    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getString(){
        return firstName + "  " + lastName;
    }

    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
}

public class ADT {
    public static void main(String[] args) throws IOException{
        System.setProperty("file.encoding", "UTF-8");

        String location = "t3.csv";
        File file = new File(location);

        Vector<Student> student = new Vector<Student>();

        readData(student,file);
        System.out.println("Total of student: " + student.size());
   
        SortLetter(student, 'เ');
        SortLetter(student, 'แ');
        SortLetter(student, 'ไ');
        SortLetter(student, 'ใ');
        SortLetter(student, 'โ');
        SortLetter(student, 'ก');
        SortLetter(student, 'ข');
        SortLetter(student, 'ฃ');
        SortLetter(student, 'ค');
        SortLetter(student, 'ฅ');
        SortLetter(student, 'ฆ');
        SortLetter(student, 'ง');
        SortLetter(student, 'จ');
        SortLetter(student, 'ฉ');
        SortLetter(student, 'ช');
        SortLetter(student, 'ซ');
        SortLetter(student, 'ฌ');
        SortLetter(student, 'ญ');
        SortLetter(student, 'ฎ');
        SortLetter(student, 'ฏ');
        SortLetter(student, 'ฐ');
        SortLetter(student, 'ฑ');
        SortLetter(student, 'ฒ');
        SortLetter(student, 'ณ');
        SortLetter(student, 'ด');
        SortLetter(student, 'ต');
        SortLetter(student, 'ถ');
        SortLetter(student, 'ท');
        SortLetter(student, 'ธ');
        SortLetter(student, 'น');
        SortLetter(student, 'บ');
        SortLetter(student, 'ป');
        SortLetter(student, 'ผ');
        SortLetter(student, 'ฝ');
        SortLetter(student, 'พ');
        SortLetter(student, 'ฟ');
        SortLetter(student, 'ภ');
        SortLetter(student, 'ม');
        SortLetter(student, 'ย');
        SortLetter(student, 'ร');
        SortLetter(student, 'ล');
        SortLetter(student, 'ว');
        SortLetter(student, 'ศ');
        SortLetter(student, 'ษ');
        SortLetter(student, 'ส');
        SortLetter(student, 'ห');
        SortLetter(student, 'ฬ');
        SortLetter(student, 'อ');
        SortLetter(student, 'ฮ');
        SortLetter(student, 'A');
        SortLetter(student, 'B');
        SortLetter(student, 'C');
        SortLetter(student, 'D');
        SortLetter(student, 'E');
        SortLetter(student, 'F');
        SortLetter(student, 'G');
        SortLetter(student, 'H');
        SortLetter(student, 'I');
        SortLetter(student, 'J');
        SortLetter(student, 'K');
        SortLetter(student, 'M');
        SortLetter(student, 'N');
        SortLetter(student, 'O');
        SortLetter(student, 'P');
        SortLetter(student, 'Q');
        SortLetter(student, 'R');
        SortLetter(student, 'S');
        SortLetter(student, 'T');
        SortLetter(student, 'U');
        SortLetter(student, 'V');
        SortLetter(student, 'W');
        SortLetter(student, 'X');
        SortLetter(student, 'Y');
        SortLetter(student, 'Z');
    }

    //Read data from csv file
    public static void readData(Vector<Student> student, File file){
        try{ 
            Scanner in = new Scanner(file);
            in.nextLine();
            while(in.hasNextLine()){
                // System.out.println(in.nextLine());
                StringTokenizer token = new StringTokenizer(in.nextLine(),",");
                token.nextToken();                
                token.nextToken();
                student.addElement(new Student(token.nextToken(), token.nextToken()));         
            }
            in.close();
            System.out.println("DATA READ SUCCESS");
        }catch(FileNotFoundException err){
            System.out.println("File not found!!!");
        }
    }
    
    public static void SortLetter(Vector<Student> studentList, char ch){
        // String List = "";
            for(Student student : studentList){
                if(student.getLastName().charAt(0) == ch){
                    System.out.println(student.getString());
                }
            }
        // System.out.println(List);
    }
}
