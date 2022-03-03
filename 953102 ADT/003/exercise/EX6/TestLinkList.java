public class TestLinkList {
    public static void main(String[] args) {
        LinkList link = new LinkList() ;
        link.insertFirst(new Node("a"));
        link.insertFirst(new Node("b"));
        link.insertFirst(new Node("c"));
        link.insertLast(new Node("d"));
        // link.printList();
        
        link.insertAt(new Node("e"),3);

        link.printList();
        
        link.insertLast(new Node("f"));
        // link.printList();

        link.removeFirst(new Node("f"));
        link.removeFirst(new Node("a"));
        link.removeFirst(new Node("c"));
        // link.printList();

        link.insertLast(new Node("b"));
        link.printList();
        
        link.removeAll(new Node("b"));
        link.printList();
        
        link.insertAt(new Node("a"),1);
        link.insertAt(new Node("a"),1);
        link.insertAt(new Node("a"),1);
        link.insertLast(new Node("a"));
        link.printList();
        
        link.removeAll(new Node("a"));
        link.printList();
    }
}
