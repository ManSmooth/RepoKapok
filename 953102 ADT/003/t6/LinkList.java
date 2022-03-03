//642115003 Kan Katpark

class Node {
    private Student student ;
    private Node next ;

    public Node(Student student){
        this.student = student ;
        this.next = null ;
    }

    public Node(Student student, Node next){
        this.student = student ;
        this.next = next ;
    }

    public String getSID() {
        return this.student.getSID();
    }

    public void setNext(Node n){
        this.next = n ;
    }

    public Node getNext(){
        return this.next ;
    }

    public Object getData(){
        return this.student ;
    }

    public String toString() {
        if(this.student == null) return "null" ;
        return (String)this.student.toString() ;
    }

}

public class LinkList {
    private Node head ;
    private int size ;

    public LinkList(){
        this.head = null ;
        this.size = 0 ;
    }

    //------- Insert method zone -------
    //insert at first
    public void insertFirst(Node n){
        Node temp = n ;
        temp.setNext(this.head);
        this.head = temp ;
        size++ ;
    }

    //insert at last
    public void insertLast(Node n ) {
        Node current = this.head ;
        while(current.getNext() != null){ 
            current = current.getNext() ;
        }
        current.setNext(n);
        size++;
    }

    //------------- Delete Zone ---------------
    //Delete last node
    public void delete(String SID) {
        Node current = this.head ;
        Node previous = null ;
        String temp = current.getSID() ;

        while( current.getNext() != null && !(temp.equals(SID))){
            previous = current ;
            current = current.getNext() ;
            temp = current.getSID() ;
        }
        // System.out.println(current);
        // System.out.println(previous);

        previous.setNext(current.getNext());
        this.size--;
    }


    //Clear all node 
    public void deleteAll() {
        this.size = 0 ;
        this.head = null ;
    }

    //Check is empty
    public boolean isEmpty() {
        return !(size > 0) ;
    }

    //Get linklist size
    public int getSize() {
        return this.size;
    }


    public void traversal() {
        Node current = this.head ;
        while(current != null) {
            System.out.println(current.toString());
            current = current.getNext() ;
        }
    }

}
