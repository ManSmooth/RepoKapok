import java.util.*;
import java.io.*;
import java.nio.charset.*;

public class A1 {
    public static void main(String[] args) {
        //################ Yan gun taek ##############
        System.setProperty("file.encoding", "UTF-8");
        // ###########################################
        //Set file encoding to UTF-8 for reading Thai character

        String location = args[0];
        File file = new File(location);

        //Declare collection Vector array to collect data
        //      A for student whose lastname is English
        //      B for student whose lastname is start with Thai special character
        //      C for student whose lastname is start with Normal Thai character
        Vector<Student> setA = new Vector<>();
        Vector<Student> setB = new Vector<>();
        Vector<Student> setC = new Vector<>();

        //Pre : Give the collection vector array
        //Post : Vector array with data 

        readData(setA, setB, setC, file);

        //Sorting all data with lovely quick sort
        //Pre : give data collection Vector array
        //    : give the start position of Vector array
        //    : give the size of Vector array
        //Post: sorted Data inside Vector array

        quickSort(setA, 0, setA.size());
        quickSort(setB, 0, setB.size());
        quickSort(setC, 0, setC.size());


        //Display the student in the list

        //For student whose lastname is English
        for (Student stu : setA) {
            System.out.println(stu.getStudent());
        }

        //For student whose lastname is start with Thai special character
        for (Student stu : setB) {
            System.out.println(stu.getStudent());
        }

        //for student whose lastname is start with Normal Thai character
        for (Student stu : setC) {
            System.out.println(stu.getStudent());
        }

    }//end main

    public static void quickSort(Vector<Student> studentList, int l, int r) {
        if (l >= r) return;

        int part = partition(studentList, l, r);
        
        //Recursion zone
        quickSort(studentList, l, part);
        quickSort(studentList, part + 1, r);

    }//end quick sort

    public static int partition (Vector<Student> studentList, int l, int r) {
        String pivot = studentList.elementAt(r - 1).getLastname();
        int i = l - 1;
        for (int j = l; j < r - 1; j++) {
            String x = studentList.elementAt(j).getLastname();
            if (x.compareTo(pivot) < pivot.compareTo(x)) {
                i++;
                swap(studentList, i, j);
            }

        }
        swap(studentList, i + 1, r - 1);
        return i + 1;
    }//end function

    public static void swap(Vector<Student> arr, int i, int j) {
        Student temp = arr.elementAt(i);
        arr.set(i, arr.elementAt(j));
        arr.set(j, temp);
    }//end swap function

    public static void readData(Vector<Student> setA, Vector<Student> setB, Vector<Student> setC, File file) {
        StringTokenizer token = null;
        String temp1 = "";
        String temp2 = "";
        String temp3 = "";
        String temp4 = "";
        try {
            Scanner sc = new Scanner(file);
            sc.nextLine();

            //Read data from the second line to the last line
            while (sc.hasNextLine()) {
                token = new StringTokenizer(sc.nextLine(), ",");
                temp1 = token.nextToken();
                temp2 = token.nextToken();
                temp3 = token.nextToken();
                temp4 = token.nextToken();

                //Check the fist character of lastname to collection in the diffence Vector array
                if (temp4.charAt(0) >= 3585 && temp4.charAt(0) <= 3630) {
                    setC.addElement(new Student(temp1, temp2, temp3, temp4));
                } else if (temp4.charAt(0) > 3630) {
                    setB.addElement(new Student(temp1, temp2, temp3, temp4));
                } else if (temp4.charAt(0) < 3585) {
                    setA.addElement(new Student(temp1, temp2, temp3, temp4));
                }

            }
            sc.close();

        } catch (FileNotFoundException er) {
            System.out.println(er);
        }
    }//end Read Function


}