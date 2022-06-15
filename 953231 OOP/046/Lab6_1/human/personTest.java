package Lab6_1.human;

import Lab6_1.human.student.statusEnum;

public class personTest {
    public static void main(String[] args) {
        person p = new person();
        p.setName("Jones");
        p.setAddress("15/9 West Bd.");
        p.setPhone("5971-1547891");
        p.setEmailAddress("Jones2@outlook.com");
        System.out.println(p);

        student s = new student(statusEnum.SENIOR);
        s.setName("James");
        s.setAddress("12/9 East Bd.");
        s.setPhone("5970-1579043");
        s.setEmailAddress("JamesP_27@gmail.com");
        System.out.println(s);

        employee e = new employee("Money Co., Ltd.", 50000);
        e.setName("Jane");
        e.setAddress("17/1 South Bd.");
        e.setPhone("2791-7791000");
        e.setEmailAddress("JaneOfLight@gmail.com");
        System.out.println(e);

        faculty f = new faculty("Cash Co., Ltd.", 200000.125, "Deputy", "9:00 - 18:00");
        f.setName("Jeanne");
        f.setAddress("Null Dimension");
        f.setPhone("9999-9999999");
        f.setEmailAddress("Jeanne_dArc@gmail.com");
        System.out.println(f);

        staff st = new staff("Legio II Augusta", -1000, "Legion Legate");
        st.setName("Juan");
        st.setAddress("Rome?");
        st.setPhone("");
        st.setEmailAddress("Juan@hotmail.com");
        System.out.println(st);
    }
}
