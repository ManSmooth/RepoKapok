//642115003 Kan Katpark

public class GenericStack <E> {
    private final int DEFAULT_CAP = 10 ;
    private E[] data ;
    private int size ;
    
    public GenericStack(int cap) {
        this.size = 0 ;
        this.data = (E[])new Object[cap] ;
    }

    public GenericStack() {
        this.size = 0 ;
        this.data = (E[])new Object[DEFAULT_CAP] ;
    }


    public E pop() {
        return data[--size] ;
    }

    public void push(E in){
        if (size >= data.length ) {
            E[] temp = (E[])new Object[data.length*2] ;
            System.arraycopy(data, 0, temp, 0 , data.length);
            data = temp ;
        }

        data[size++] = in ;
    }

    public E peek() {
        return data[size - 1] ;
    }

    public int getSize() {
        return this.size; 
    }

    public int getCap(){
        return data.length ;
    }

    public boolean isEmpty() {
        return this.size == 0 ;
    }

}