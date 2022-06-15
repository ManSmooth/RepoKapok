import java.util.*;
public class Main {
    public static void main(String[] args) {

        LinkList list = new LinkList() ;
        insertMockData(list);

        list.traversal() ;

        list.delete("002");
        System.out.println("DELETE SID NO. 002 list size: " +list.getSize());
        // list.traversal() ;
        
        list.delete("009");
        System.out.println("DELETE SID NO. 009 list size: " +list.getSize());
        
        list.traversal() ;
        
        list.deleteAll();
        System.out.println("DELETE ALL list size: " +list.getSize());
        list.traversal() ;
        
    }

    public static void insertMockData(LinkList list){
        
        Vector vac_list1 = new Vector<Vaccine>();
        vac_list1.addElement(new Vaccine("Pfizer", new Date(2020,10,02))) ;
        vac_list1.addElement(new Vaccine("Pfizer", new Date(2020,12,02))) ;

        Vector vac_list2 = new Vector<Vaccine>();
        vac_list2.addElement(new Vaccine("Sinovac", new Date(2020,10,12))) ;
        vac_list2.addElement(new Vaccine("Sinovac", new Date(2020,12,21))) ;

        Node s = new Node(new Student("001", "Kan", "Katpark" , vac_list1));
        list.insertFirst(s);

        s =  new Node(new Student("002", "AAAA", "AAAA" , vac_list2));
        list.insertLast(s);
        s =  new Node(new Student("003", "BBBB", "BBBB" , vac_list2));
        list.insertLast(s);
        s =  new Node(new Student("004", "CCCC", "CCCC" , vac_list1));
        list.insertLast(s);
        s =  new Node(new Student("005", "DDDD", "DDDD" , vac_list1));
        list.insertLast(s);
        s =  new Node(new Student("006", "EEEE", "EEEE" , vac_list1));
        list.insertLast(s);
        s =  new Node(new Student("007", "FFFF", "FFFF" , vac_list2));
        list.insertLast(s);
        s =  new Node(new Student("008", "IIII", "IIII" , vac_list1));
        list.insertLast(s);
        s =  new Node(new Student("009", "JJJJ", "JJJJ" , vac_list2));
        list.insertLast(s);
        s =  new Node(new Student("010", "KKKK", "KKKK" , vac_list1));
        list.insertLast(s);
    }
}
