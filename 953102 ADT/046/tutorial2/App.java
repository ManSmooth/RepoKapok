package tutorial2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.text.Collator;

public class App {
    public static void main(String[] args) throws IOException {
        Collator thaiC = Collator.getInstance(new Locale("th", "TH"));
        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(App.class.getPackageName().length() > 0 ? App.class.getPackageName() + "\\out.txt" : "out.txt"), StandardCharsets.UTF_8));
        List<Student> students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(
                        App.class.getPackageName().length() > 0 ? App.class.getPackageName() + "\\t2.csv" : "t2.csv"),
                StandardCharsets.UTF_8))) {
            String in;
            boolean go = false;
            while ((in = br.readLine()) != null) {
                if (in.charAt(0) == '1') {
                    go = true;
                }
                if (!go) {
                    continue;
                }
                String[] temp = in.split(",");
                if(temp[2].substring(0,3).equals("นาย")) {
                    students.add(new Student(Integer.parseInt(temp[1]), temp[2].substring(3), temp[3]));
                }
                else {
                    students.add(new Student(Integer.parseInt(temp[1]), temp[2].substring(6), temp[3]));
                }
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        students.sort((e1, e2) -> thaiC.compare(e1.getFirstName(), e2.getFirstName()));
        while (students.size() > 0) {
            char c = students.get(0).getFirstName().charAt(0);
            long count = students.stream().filter(t -> t.getFirstName().charAt(0) == c).count();
            bw.write(String.format("%c: %d\n", c, count));
            for (int i = 0; i < count; i++) {
                bw.write(students.get(0) + "\n");
                bw.flush();
                students.remove(0);
            }
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
            return String.format("%9d, %s %s", ID, firstName, lastName);
        }
    }
}
