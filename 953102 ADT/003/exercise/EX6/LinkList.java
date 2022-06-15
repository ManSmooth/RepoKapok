class Node {
    private Object data ;
    private Node next ;

    public Node(Object data){
        this.data = data ;
        this.next = null ;
    }

    public Node(Object data, Node next){
        this.data = data ;
        this.next = next ;
    }

    public void setNext(Node n){
        this.next = n ;
    }

    public Node getNext(){
        return this.next ;
    }

    public Object getData(){
        return this.data ;
    }

    public String toString() {
        if(this.data == null) return "null" ;
        return (String)this.data ;
    }

}

public class LinkList {
    private Node head ;
    private int size ;

    public LinkList() {
        this.head = null ;
        this.size = 0 ;
    } // Constructor of linklist


    //Purpose Insert node at front
    public void insertFirst(Node n){
        Node temp = n ;
        temp.setNext(this.head);
        this.head = temp ;
        size++ ;
    }

    //Purpose Insert node at last
    public void insertLast(Node n ) {
        Node current = this.head ;
        while(current.getNext() != null){ 
            current = current.getNext() ;
        }
        current.setNext(n);
        size++;
    }

    //Purpose Insert at the given index
    public void insertAt(Node n , int i){
        if(i < 0 || i > size) return ;
        if(i == 0) insertFirst(n);
        if(i == size+1) insertLast(n);

        int count = 0 ;
        Node current = this.head ;
        Node previous = null ;

        while(current.getNext() != null && count < i ){
            previous = current ;
            current = current.getNext() ;
            count++ ;
        }

        Node temp = n ;
        n.setNext(current);
        previous.setNext(temp);
        size++;
    }

    //purpose Remove the same value node
    public void removeFirst(Node n){
        if(this.head == null) return ;
        Node current = this.head ;
        Node previous = this.head ;
        Object target = n.getData() ;
        while(current != null && current.getData() != target){
            previous = current ;
            current = current.getNext() ;
        }

        //If the removed value is head of the linklist
        if(previous.getData() == current.getData()){
            this.head = this.head.getNext();
        }

        previous.setNext(current.getNext());
        size-- ;
    }

    //purpose Remove all same value node

    public void removeAll(Node n) {
        if(this.head == null) return ;
        Node current = this.head ;
        Node previous = null ;
        Object target = n.getData() ;

        while(current != null ){
            if(current.getData() == target){
                // if remove node is head
                if(previous == null ){
                    this.head = this.head.getNext();
                }//if remove node is tail
                else if(current.getNext() == null){
                    previous.setNext(null);
                }//if remove node is in between others
                else{
                    previous.setNext(current.getNext());
                    current = previous ;
                }
                size-- ; 
            }

            previous = current ;
            current = current.getNext() ;
        }
    }

    public void printList() {
        Node current = this.head ;
        do{
            System.out.print(current.toString() + " -> ");
            current = current.getNext() ;
 
        }while(current != null) ;
        System.out.println("null");
    }
    
    public int getSize() {
        return this.size;
    }
}