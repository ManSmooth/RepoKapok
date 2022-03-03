import java.util.*;
import java.io.*;

//Author Kan Katpark 642115003

public class t2 {
    public static void main(String[] args) {
        final String location = "t2.csv";
        File file = new File(location);

        Vector<Student> studentList = new Vector<Student>();

        // copy data
        loadData(studentList, file);

        // Display size
        System.out.println("Total student " + studentList.size());

        //'65' = A , '90' = Z Display student list
        for(int i = 65 ; i < 90;i++){
            displayStudentByCharacter(studentList, (char)i);
        }

    }

    public static void loadData(Vector<Student> studentList, File file) {
        StringTokenizer token = null;
        String temp1 = "";
        String temp2 = "";
        String temp3 = "";

        try {
            // Open file
            Scanner scan = new Scanner(file);

            // Start copy data
            while (scan.hasNext()) {
                // Cut the ","
                token = new StringTokenizer(scan.next(), ",");

                temp1 = token.nextToken();
                temp2 = token.nextToken();
                temp3 = token.nextToken();

                // Assign data to storage
                studentList.addElement(new Student(temp1, temp2, temp3));

            }
            scan.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void displayStudentByCharacter(Vector<Student> studentList,char ch){
        int count = 0;
        String displayList= "";
        for(Student student: studentList){
            if(student.getFname().charAt(0) == ch){
                count++;
                displayList += student.getSID()+" : " ;
                displayList += student.getFname()+ "\t";
                displayList += student.getLname() + "\n";
            }
        }
        if(count == 0) return ;
        System.out.println(ch+": "+count +"\n"+displayList);
    }
}
