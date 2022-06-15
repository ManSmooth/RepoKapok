package Assignment1;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.text.Collator;
import java.util.*;

public class readfile {
    public static void main(String[] args) throws IOException {
        if(args.length < 1) {
            System.out.printf("Missing Input file.\nreadfile.java [relative input csv path] [relative output path]");
            return;
        }
        Collator thaiC = Collator.getInstance(new Locale("th", "TH"));
        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(
                        args.length > 1 ? args[1]
                                : "out.txt"),
                        StandardCharsets.UTF_8));
        List<Student> students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(
                        args[0]
                ),
                StandardCharsets.UTF_8))) {
            String in;
            br.readLine();
            while ((in = br.readLine()) != null) {
                String[] temp = in.replaceAll("\"", "").split(",");
                students.add(new Student(Integer.parseInt(temp[0].trim()), temp[2], temp[3]));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        students.sort((e1, e2) -> thaiC.compare(e1.getLastName(), e2.getLastName()));
        bw.write(String.format("Total # of student: %d\n", students.size()));
        bw.flush();
        for (Student s : students) {
            bw.write(String.format("%s\n", s));
            bw.flush();
        }
        bw.close();
    }

    static class Student {
        private int ID;
        private String firstName, lastName;

        public int getID() {
            return this.ID;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public Student(int ID, String firstName, String lastName) {
            this.ID = ID;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String toString() {
            return String.format("%s %s", firstName, lastName);
        }
    }
}