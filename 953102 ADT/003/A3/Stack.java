//642115003 Kan Katpark
class Stack {
    private LinkList data ;
    
    public Stack() {
        data = new LinkList() ;
    } 

    public boolean isEmpty() {
        return data.isEmpty() ;
    }

    //push 
    public void push(char ch){
        data.insert(ch);
    }

    //Throw an error when stack is underflow
    public char pop() {
        if(isEmpty()){
            throw new ArrayIndexOutOfBoundsException("Stack underflow") ;
        }
        return data.deleteLast() ;
    }

    public char peek() {
        if(isEmpty()){
            throw new ArrayIndexOutOfBoundsException("Stack underflow") ;
        }
        return data.getTail() ;
    }
}
