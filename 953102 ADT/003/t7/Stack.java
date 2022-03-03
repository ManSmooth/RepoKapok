import java.util.Vector; 
class Stack {
    private Vector<Object> data ;
    private int size ;


    public Stack() {
        this.data = new Vector<>() ;
        this.size = 0 ;
    }

    public void push(Object x) {
        data.addElement(x);
        this.size++;
    }

    public Object pop() {
        if(size <= 0) throw new IndexOutOfBoundsException("Stack underflow") ;

        this.size-- ;
        return data.remove(size);
    }

    public boolean isEmpty() {
        return this.size == 0 ;
    }


}
