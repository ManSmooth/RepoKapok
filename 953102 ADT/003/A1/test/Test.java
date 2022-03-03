
//642115003 Kan Katpark
import java.util.*;
import java.io.*;
import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) {

        // ################################################
        System.setProperty("file.encoding", "UTF-8");
        // ################################################

        // Get file location and name from args
        final String location = "t3.csv";
        File file = new File(location);
        Vector<Student> studentList = new Vector<>();

        // PRE :
        // Collection vector array and csv. file location
        // POST:
        // Save the data into the given vector array
        loadData(studentList, file);

        // Sort data just only sort with
        sortData(studentList);

        for (Student stu : studentList) {
            char t1 = stu.getLastname().charAt(0);
            char t2 = stu.getLastname().charAt(1);
            
            System.out.print(stu.getStudent());
            
            System.out.println("\t" + getLastnameChar(stu, 0) + " \t" + t1 + " "+ t2 + "  " + (int)(t1+t2) );
        }

    }

    public static void loadData(Vector<Student> studentList, File file) {
        StringTokenizer token = null;
        String temp1 = "";
        String temp2 = "";
        String temp3 = "";
        String temp4 = "";

        try {

            Scanner sc = new Scanner(file);
            sc.nextLine();
            while (sc.hasNext()) {
                token = new StringTokenizer(sc.nextLine(), ",");

                temp1 = token.nextToken();
                temp2 = token.nextToken();
                temp3 = token.nextToken();
                temp4 = token.nextToken();

                // System.out.println(temp1 + " " +temp2 + " " + temp3 + " " +temp4);

                studentList.addElement(new Student(temp1, temp2, temp3, temp4));
            }

            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("ERROR :" + e);
        }
    }

    public static void sortData(Vector<Student> studentList) {
        for (int i = 0; i < studentList.size(); i++) {

            int key = getLastnameChar(studentList.elementAt(i), 0);
            int j = i - 1;

            while (j >= 0 && getLastnameChar(studentList.elementAt(j), 0) > key) {
                swap(studentList, j, j + 1);
                j--;
            }

        }

    }

    public static int getLastnameChar(Student stu, int i) {
        try {
            if (i == 2) return 0;

            int text = (int) stu.getLastname().charAt(i);
            if (text >= 3585) {
                // System.out.print(text > 3631 && text < 3642 );
                if (text > 3631 && i == 0) {
                    return 50 * (text - 3653) + getLastnameChar(stu, i + 1);
                } else if (text < 3631 && i == 0) {
                    return text;
                } 
                
                return text + getLastnameChar(stu, i + 1);
                
            }
            return text + getLastnameChar(stu, i + 1);
        } catch (StringIndexOutOfBoundsException e) {
            return 0 + getLastnameChar(stu, i + 1);
        }
    }

    public static void swap(Vector<Student> studentList, int i, int j) {
        Student temp = studentList.elementAt(i);
        studentList.set(i, studentList.elementAt(j));
        studentList.set(j, temp);
    }

}
