//642115003 Kan Katpark

class Node {
    protected char data ;
    protected Node next ; 

    public Node( char data ){
        this.data = data ;
        this.next = null ;
    }

    public Node(char data , Node next){
        this.data = data ;
        this.next = next ;
    }

    public Node getNext() {
        return this.next ;
    }

    public void setNext(Node next){
        this.next = next ;
    }

    public void setNext(char ch){
        Node temp = new Node(ch) ;
        this.next = temp ;
    }

    public char getData() {
        return this.data ;
    }

}

class LinkList {
    private Node head ;
    private int size ;

    //Constructor 
    public LinkList(){
        this.head = null ;
        this.size = 0 ;
    }

    //Set linklist head can be accessed by insert method
    private void setHead(char ch){
        Node temp = new Node(ch);
        this.head = temp ;
    }

    //Insert new to linklist 
    public void insert(char ch){
        //When linklist is empty set new node to head
        if(isEmpty()){
            setHead(ch);
            size++;
            return ; 
        }

        //Insert node at last position
        Node current = this.head ;
        while(current.getNext() != null){
            current = current.getNext() ;
        }
        current.setNext(ch);
        size++;
    }

    //Get last node
    public char getTail() {
        Node current = this.head ;

        while(current.getNext() != null){
            // System.out.println(current.getData());
            current = current.getNext() ;
        }

        return current.getData() ;
    }

    //Delete last node and return it
    public char deleteLast() {
        Node current = this.head ;
        Node previous = null ;
        char returnCh ;

        while(current.getNext() != null){
            
            previous = current ;
            current = current.getNext() ;
        }

        returnCh = current.getData() ;
        if(this.size == 1 ){
            this.head = null;
            size--;
            return returnCh ;
        }
        previous.setNext(null);
        size--;


        return returnCh ;
    }

    //Check is linklist empty
    public boolean isEmpty() {
        return size == 0 ;
    }


}